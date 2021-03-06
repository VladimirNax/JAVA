package skillfactory.actions;
import skillfactory.*;

/**
 * Класс для реализации действия "Показать баланс", используется в skillfactory.StartUI.
 */
public class ShowBalanceAction implements UserAction {

    @Override
    public String getTitle() {
        return "Показать баланс";
    }

    /**
     * В этом методе обращайтесь к банковскому сервису, уточняйте у пользователя на сколько он хочет
     * пополнить баланс, каким способом... печатайте результат, может быть баланс после пополнения
     * (на ваше усмотрение).
     *
     * @param bankService skillfactory.BankService объект.
     * @param input skillfactory.Input объект.
     * @param requisite Строка в произвольной форме, используется для поиска пользователя.
     * @return возвращает всегда true, приложение продолжает работать.
     */
    @Override
    public boolean execute(BankService bankService, Input input, String requisite) {
        System.out.println("Ваш баланс: "+bankService.balance(requisite));
        return true;
    }
}
