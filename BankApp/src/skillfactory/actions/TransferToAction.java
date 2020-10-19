package skillfactory.actions;

import skillfactory.*;

import java.util.Optional;

/**
 * Класс для реализации действия "Перевести средства", используется в skillfactory.StartUI.
 */
public class TransferToAction implements UserAction {

    @Override
    public String getTitle() {
        return "Перевести средства";
    }

    /**
     * Перевести средства - также общаетесь в этом методе с пользователем и передаёте информацию,
     * так как операция важная желательно ещё раз заставлять вводить пароль/логин и передавать информацию
     * в skillfactory.BankService. Exceptions пользователю печатать не надо (как и в других методах этого класса),
     * вводите подсказки или написанные вами сообщения об ошибках.
     *
     * @param bankService skillfactory.BankService объект.
     * @param input       skillfactory.Input объект.
     * @param requisite   Строка в произвольной форме, используется для поиска пользователя.
     * @return возвращает всегда true, приложение продолжает работать.
     */
    @Override
    public boolean execute(BankService bankService, Input input, String requisite) {
        boolean authComplete = true;
        while (authComplete) {

            String login = input.askStr("Введите Ваш логин: ");
            String pass = input.askStr("Введите Ваш password: ");
            Optional<String> check = bankService.getRequisiteIfPresent(login, pass);

            if (check.isPresent()) {
                if (check.get().equals(requisite)) {
                    while (authComplete) {
                        String requ = input.askStr("Введите реквизиты получателя: ");
                        if (bankService.checkRequisite(requ)) {
                            if (requ.equals(requisite)) {
                                System.out.println("Это Ваши реквизиты! Введите реквизиты получателя.");
                            } else {
                                bankService.transferMoney(
                                        login,
                                        pass,
                                        requisite,
                                        requ,
                                        input.askLong("Введите сумму для перевода: ")
                                );
                                authComplete = false;
                            }

                        } else {
                            System.out.println("Реквизиты не существуют! Попробуйте еще раз. ");
                        }
                    }
                } else {
                    System.out.println("Попробуйте еще раз! ");
                }
            } else {
                System.out.println("Имя или пароль, не совпадают! Попробуйте еще раз.");
            }
        }

        return true;
    }
}
