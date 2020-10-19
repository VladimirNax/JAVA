package skillfactory;//package ru.skillfactory;

import java.util.Scanner;

/**
 * Имплементация интерфейса skillfactory.Input, которая игнорирует проблемы неправильного ввода пользователем.
 */
public class ConsoleInput implements Input {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        try {
            return Integer.parseInt(askStr(question));
        } catch (NumberFormatException e) {
            System.out.println("Данный формат поддерживает только цифры.");
        }
        return 0;
    }

    /**
     * Метод необходимо реализовать.
     */
    @Override
    public long askLong(String question) {
        try {
            return Long.parseLong(askStr(question));
        } catch (NumberFormatException e) {
            System.out.println("Некорректная сумма ввода.");
        }
        return 0;
    }
}
