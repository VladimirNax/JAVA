import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {
        //Добавить считывание ввода пользователя в цикле
        Scanner scanner = new Scanner(System.in);
        String[][] arrPhoneBook = new String[50][2]; //50 — количество строк, 2 — столбцов
        arrPhoneBook[0][0] = "Иванов Иван Иванович";
        arrPhoneBook[0][1] = "8 911 999 99 99";
        arrPhoneBook[1][0] = "Сергеева Мария Анатольевна";
        arrPhoneBook[1][1] = "8 888 454 33 33";
        arrPhoneBook[2][0] = "Яшкин Валентин Петрович";
        arrPhoneBook[2][1] = "8 788 567 44 44";

        list(arrPhoneBook);

        String name = "";
        String phoneNumber = "";

        boolean isCorrectName = false;
        while (!isCorrectName) {
            name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
        boolean isCorrectNumber = false;
        while (!isCorrectNumber) {
            phoneNumber = scanner.nextLine(); //Считывает строку из System.in
            isCorrectNumber = checkPhoneNumber(phoneNumber);
            if (!isCorrectNumber) {
                System.out.println("Введите корректный номер!");
            } else {
                System.out.println(formatPhoneNumber(phoneNumber));
            }
        }

        add(arrPhoneBook, formatName(name), formatPhoneNumber(phoneNumber));
        list(arrPhoneBook);

    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        if (clean.length() == 11) return true;
        else return false;
    }

    public static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        if (words.length == 3) return true;
        else return false;

    }

    public static String formatName(String name) {
        String[] arrWords = name.split(" ");
        String result = "";
        if (checkName(name)) {
            for (int i = 0; i < arrWords.length; i++) {
                //arrWords[i] = arrWords[i].replaceAll(String.valueOf(arrWords[i].charAt(0)), String.valueOf(arrWords[i].charAt(0)).toUpperCase());
                String str = arrWords[i];
                char fist = str.charAt(0);
                if (!Character.isUpperCase(fist)) {
                    result += Character.toUpperCase(fist) + str.substring(1) + " ";
                } else {
                    result += str + " ";
                }
            }
            return result;
        }
        return "Введите ФИО через пробел";
    }

    public static String formatPhoneNumber(String number) {
        if (checkPhoneNumber(number)) {
            String clean = number;
            String result = "+7" + " " + clean.substring(1, 4) + " " +
                    clean.substring(4, 7) + " " + clean.substring(7, 9) + " " + clean.substring(9);
            return result;
        } else {
            return "Номер должен содержать 11 цифр.";
        }

    }

    public static void add(String[][] book, String name, String number) {
        //add logic
        for (int i = 0; i < book.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (book[i][j] == null) {
                    book[i][j] = name;
                    book[i][j + 1] = number;
                    break;
                }
            }
        }
    }

    public static void list(String[][] book) {
        //print phone book
        for (int i = 0; i < book.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (book[i][j] != null) System.out.println(book[i][j] + ": " + book[i][j + 1]);
            }
        }


    }
}
