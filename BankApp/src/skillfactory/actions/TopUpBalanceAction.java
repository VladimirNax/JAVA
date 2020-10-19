package skillfactory.actions;
import skillfactory.*;

/**
 * Класс для реализации действия "Пополнить баланс", используется в skillfactory.StartUI.
 */
public class TopUpBalanceAction implements UserAction {

    @Override
    public String getTitle() {
        return "Пополнить баланс";
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
        bankService.topUpBalance(requisite, input.askLong("Введите сумму для пополнения баланса: "));
        return true;
    }
}
