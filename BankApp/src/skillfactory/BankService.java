package skillfactory;


import java.util.*;

/**
 * skillfactory.BankService - класс, который нарушает принцип единственной ответственности. У нас он сразу
 * и хранит аккаунты, и реализует логику проверки баланса и переводов. Можете использовать
 * его в текущем виде, можете решить проблему множественной ответственности и создать интерфейс
 * AccountStore, написать его реализации и в skillfactory.BankService передавать хранилище. В этом случае в
 * этом классе должна быть только логика переводов + баланс и вы просто обращаетесь в store, передовая
 * ответ на уровень выше.
 */
public class BankService {
    /**
     * В Map-е храните аккаунты, ключ это реквизиты
     * (реквизиты у аккаунтов неизменяемые, это важно сохранить чтобы ключ в map всегда был такой же как у аккаунта).
     * <p>
     * Подумайте почему используется именно map, можно ли использовать решение лучше.
     */
    private final Map<String, BankAccount> accounts = new HashMap<>();

    /**
     * Метод добавляете аккаунт в Map-у, если у аккаунта уникальные реквизиты (можно проверить что в Map нет ключа с такими реквизитами).
     * <p>
     * Если поймёте как использовать и верно примените Map.putIfAbsent будет очень хорошо. Этот метод добавляет значание в map если ключ в map ранее не был.
     *
     * @param account Аккаунт с заполненными полями.
     */
    public void addAccount(BankAccount account) {
        accounts.put(account.getRequisite(), account);
    }

    /**
     * Метод проверяет что в Map-е есть аккаунт, если есть вернёт реквезиты. В моей реализации
     * метод просто вернёт реквезиты без генерации исключений. Вы можете использовать подход с
     * исключениями, тогда на каждую ситуацию должно быть отдельное исключение
     *
     * @param username валидная строка.
     * @param password валидная строка.
     * @return возвращает объект Optional, который будет содержат строку - requisite,
     * если передоваемого пользователя нету или пароль не совпадает вы сможете
     * передать пустой объект Optional и проверить что он не пуст.
     */
    public Optional<String> getRequisiteIfPresent(String username, String password) {

        if (!accounts.isEmpty()) {

            for (Map.Entry<String, BankAccount> item : accounts.entrySet()) {
                //System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
                if (item.getValue().getUsername().equals(username) && item.getValue().getPassword().equals(password)) {
                    //System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
                    return Optional.of(item.getValue().getRequisite());
                }
            }

        }
        return Optional.empty();

    }

    /**
     * Метод кол-во средств на передаваемых реквизитах. На этом методе вам нужно выкидывать исключение,
     * если передаваемые реквизиты не валидны, это единственный способ сообщить о проблеме.
     *
     * @param requisite реквизиты, строка в произвольном формате.
     * @return кол-во средств в копейках (для других валют аналогично было бы).
     */
    public long balance(String requisite) {
        long result = 0;
        for (Map.Entry<String, BankAccount> item : accounts.entrySet()) {
            if (item.getValue().getRequisite().equals(requisite)) {
                //System.out.println(item.getValue());
                result = item.getValue().getBalance();
            }
        }
        return result;
    }

    /**
     * Метод должен пополнять баланс.
     *
     * @param requisite реквизиты, строка в произвольном формате.
     * @param amount    сумма для пополнения.
     * @return возвращает true если баланс был увеличен.
     */
    public boolean topUpBalance(String requisite, long amount) {
        boolean result = false;
        for (Map.Entry<String, BankAccount> item : accounts.entrySet()) {
            if (item.getValue().getRequisite().equals(requisite)) {
                if (amount > 0){
                    item.getValue().setBalance(item.getValue().getBalance() + amount);

                    result = true;
                }else{
                    System.out.println("Введите сумму больше 0 (нуля)");
                }
            }
        }
        return result;
    }

    /**
     * Метод, если все условия соблюдены, переводит средства с одного счёта на другой.
     *
     * @param username      строка в произвольном формате.
     * @param password      строка в произвольном формате.
     * @param srcRequisite  реквизиты, строка в произвольном формате.
     * @param destRequisite реквизиты, строка в произвольном формате.
     * @param amount        кол-во средств в копейках (для других валют аналогично было бы).
     * @return true если выполнены все условия, средства фактически переведены.
     */
    public boolean transferMoney(String username, String password, String srcRequisite,
                                 String destRequisite, long amount) {
        boolean rsl = false;

        for (Map.Entry<String, BankAccount> item : accounts.entrySet()) {
            if (item.getValue().getRequisite().equals(srcRequisite)) {

                long balance = item.getValue().getBalance(); // баланс текущего пользователя

                // проверить баланс, если денег хватает то продолжаем
                if (balance >= amount && amount > 0) {
                    item.getValue().setBalance(balance - amount); // забираем деньги с текущего баланса
                    topUpBalance(destRequisite, amount); // пополнение баланса другого пользователя
                    System.out.println("Успешно! Сумма перевода: "+amount+" на реквизиты {"+destRequisite+"}");
                    rsl = true;
                } else if(amount > 0) {
                    System.out.println("У Вас не хватает средств на счете! " + balance);
                    System.out.println("Пополните свой баланс");
                    rsl = false; //завершаем
                } else {
                    System.out.println("Некорректная операция");
                }
            }


            //if(item.getValue().getRequisite().equals(destRequisite)){ }

        }


        return rsl;
    }

    // Проверка на существование реквизитов
    public boolean checkRequisite(String requisite) {
        boolean rsl = false;
        for (Map.Entry<String, BankAccount> item : accounts.entrySet()) {
            if (item.getKey().equals(requisite)) {
                rsl = true;
            }
        }
        return rsl;
    }

}
