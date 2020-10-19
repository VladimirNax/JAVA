package skillfactory.actions;
import skillfactory.*;

//import ru.skillfactory.*;

/**
 * Интрефейс для реализации различных действий, которые используются в UI.
 */
public interface UserAction {

    /**
     * Получить подзаголовок Action-а.
     *
     * @return Строку текста, которая содержит заголовок для действия.
     */
    String getTitle();

    /**
     * Выполнить Action.
     *
     * @param bankService skillfactory.BankService объект.
     * @param input skillfactory.Input объект.
     * @param requisite Строка в произвольной форме, используется для поиска пользователя.
     * @return true если после этого действие приложение продолжает работу.
     */
    boolean execute(BankService bankService, Input input, String requisite);
}