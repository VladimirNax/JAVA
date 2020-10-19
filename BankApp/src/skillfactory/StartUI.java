package skillfactory;//package ru.skillfactory;

//import ru.skillfactory.skillfactory.actions.*;

import skillfactory.actions.*;

import java.util.*;

/**
 * Класс, который запускает общение с пользователем.
 */
public class StartUI {

    /**
     * Здесь будет происходить инициализация меню, вы
     *  1. Авторизовываете пользователя.
     *  2. Печатаете меню.
     *  3. В зависимости от введённого числа запускаете нужную функцию.
     *
     * @param bankService skillfactory.BankService объект.
     * @param actions массив с действиями.
     * @param input skillfactory.Input объект.
     */
    public void init(BankService bankService, UserAction[] actions, Input input) {
        String requisite = authorization(bankService, input);
        showMenu(actions);
        boolean run = true;
        while (run) {
            int select = input.askInt("Выберите пункт меню: ");
            // Здесь такой if, который не даст выйти в ArrayIndexOutOfBoundsException.
            if (select >= 0 && select <= actions.length - 1) {
                // Мы по индексу массива вызываем метод execute нашего Action-объекта.
                run = actions[select].execute(bankService, input, requisite);
                showMenu(actions);
            } else {
                System.out.println("Такого пункта нету...");
            }
        }
    }


    /**
     * Метод должен работать пока пользователь не авторизуется (пока отключил цикл!).
     *
     * @param bankService skillfactory.BankService объект.
     * @param input skillfactory.Input объект.
     * @return возвращает реквизиты аккаунта, под которым авторизовался пользователь.
     *         Получайте их вызывом метода getRequisiteIfPresent, класса skillfactory.BankService.
     */
    private String authorization(BankService bankService, Input input) {
        String rsl = null;
        boolean authComplete = true;
        while (authComplete) {
            /*
             * Запрашиваете у пользователя логин, пароль пока он не пройдёт авторизацию.
             * Авторизация пройдена при условие что в skillfactory.BankService есть пользователь с
             * данным логином и паролем (работайте только с теми пользователями что есть).
             */

            String login = input.askStr("Ваш логин: ");
            String password = input.askStr("Ваш password: ");

            if(bankService.getRequisiteIfPresent(login,password).isPresent()){
                rsl = bankService.getRequisiteIfPresent(login,password).get();
                System.out.println("Добрый день, {владелец счета:"+rsl+"}! Какую услугу желаете произвести?");
                authComplete = false;

            }else {
                System.out.println("Имя или пароль, не совпадают! Попробуйте еще раз.");
            }

        }
        return rsl;
    }

    /**
     * Печатается меню пользователя (только печатается, общения с пользователем нету).
     *
     * @param actions массив с действиями.
     */
    private void showMenu(UserAction[] actions) {
        //System.out.println("Menu.");
        String str = "";
        for (int index = 0; index < actions.length; index++) {
            str += index + ". " + actions[index].getTitle() +"  ";
            //System.out.println(index + ". " + actions[index].getTitle());
        }

        System.out.println("Menu: "+str);
    }

    public static void main(String[] args) {
        BankService bankService = new BankService();
        // здесь создадите несколько аккаунтов на проверку
        // данные осмысленно заполните, не просто пустые строки
        bankService.addAccount(new BankAccount("Олег", "111", "1111-111-11"));
        bankService.addAccount(new BankAccount("Сара", "1a2", "2222-222-22"));
        bankService.addAccount(new BankAccount("Влад", "qwe", "3333-333-33"));
        bankService.addAccount(new BankAccount("Инна", "@43", "4444-444-44"));
        // Ещё аккаунты

        // В массиве хранятся объекты, которые представляют наши действия.
        UserAction[] actions = {
                new ShowBalanceAction(),
                new TopUpBalanceAction(),
                new TransferToAction(),
                new Exit()
        };
        // Наш skillfactory.Input можно менять на нужную реализацию (skillfactory.ValidateInput доделайте)
        Input input = new ValidateInput();
        // Запускаем наш UI передавая аргументами банковский сервис, экшены и skillfactory.Input.
        new StartUI().init(bankService, actions, input);
    }
}
