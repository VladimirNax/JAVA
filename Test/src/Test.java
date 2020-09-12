
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {


    public static void main(String[] args) throws ParseException {
        /*Scanner scanner = new Scanner(System.in); //используется для считывания ввода с клавиатуры
        int value = scanner.nextInt(); //считывает число
        while (value != 10) {
            System.out.println("Введите 10, тогда программа закончит свою работу.");
            value = scanner.nextInt();
        }*/
        new Test();
        /*int sum = 0;
        int[] array = {4, 5, 6, 34, 55};
        swap(array, 1, 2);

        for (int i : array) {
            System.out.println(i); // валидный код
            sum += i;
        }
        System.out.println("Сумма="+sum);*/

        /*String[][] arr2D = new String[8][8]; //8x8
        int ii=0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //System.out.println(arr[i][j]);
                if(ii%2==0){
                    arr2D[i][j]="0";
                }else {
                    arr2D[i][j]="[]";
                }

                ii++;
            }
            ii++;
        }*/
        //print2DArray(arr2D);
        /*String[][] board = new String[8][8];
        for (int row = 0; row < board.length; row++) {                   // Создаём внешний и внутренние циклы
            for (int column = 0; column < board[row].length; column++) { // для обхода всех индексов
                if (row % 2 == 0) { // Если строка чётная (номер строки делится на 2 без остатка)
                    board[row][column] = column % 2 == 0 ? "white" : "black"; // если столбец чётный, пишем в ячейку white,
                    // и если нечётный, наоборот
                } else { // Если строка нечётная (номер строки делится на 2 с остатком)
                    board[row][column] = column % 2 == 0 ? "black" : "white"; // аналогично, только на чётный пишем black
                }
            }
        }
        print2DArray(board);*/

        /*char[] array = concat("String", "Concatenation");
        System.out.println(Arrays.toString(array));*/

        /*System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));*/

        /*String palindrome = "Веди, швед, за руку, раздевши, дев";
        System.out.println(isPalindrome(palindrome));*/

        //System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));

        /*Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }*/

        /*Scanner scanner = new Scanner(System.in);
        boolean isCorrectNumber = false;
        while (!isCorrectNumber) {
            String phoneNumber = scanner.nextLine(); //Считывает строку из System.in
            isCorrectNumber = checkPhoneNumberIsCorrect(phoneNumber);
            if (!isCorrectNumber) {
                System.out.println("Введите корректный номер!");
            } else {
                System.out.println(formatNumber(phoneNumber));
            }
        }*/

        /*int varInt = 34;
        float varFloat = 36.6f;
        String varString = "Some value";

        String formatted = String.format("Значение переменной с типом " + "int = %d, " +
                "а значение float = %f, " +
                "и string = %s", varFloat , varInt, varString);

        System.out.println(formatted);*/

        //System.out.println(formatString("Первая строка", "Вторая строка", 44));

        /*Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        System.out.println("Вес большой кошки = " + bigCat.getWeight());

        Student user1 = new Student("Влад","Нуконов" ,32, 5, 16 , 8, "нет данных");
        Student user2 = new Student("Иван","Иванов", 22 ,0 , 4, 12,"");
        Student user3 = new Student("Иван","Иванов", 35 ,0 , 2, 4,"");
        System.out.println("user: " + user1.getName() +" "+ user1.groupNumber);
        System.out.println("user: " + user2.getName() +" "+ user2.getSurname()+" "+user2.solvedProblems +" "+ user2.groupNumber);

        Student student;
        user1.ModulePassed(user1.getName(),user1.getSurname());
        user2.ModulePassed(user2.getName(),user2.getSurname());


        System.out.println("сумма решенных задач всеми студентами "+Student.sumSolvedProblems);
        System.out.println("максимальное количество модулей "+Student.maxCompletedModules);

        System.out.println(user1.toString());*/



        /*Pattern pattern = Pattern.compile("([А-Я][а-я]+(-[А-Я][а-я]+)*(\\s+|$)){3}");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            System.out.println("Имя корректно!");
        } else System.out.println("Имя некорректно!");*/

        /*//устанавливаем два рандомных значения
        double x = (int) (Math.random() * 100) * 10;
        double y = (int) (Math.random() * 100) * 10;
        double z = (int) (Math.random() * 100) * 10;

        // печатаем их на экран
        System.out.println("Random number 1:" + x);
        System.out.println("Random number 2:" + y);
        System.out.println("Random number 3:" + z);
        // находим максимальное из двух чисел
        System.out.println("Highest number:" + Math.max(Math.max(x, y), z));*/

        /*Scanner con = new Scanner(System.in);

        int a = con.nextInt();
        int b = con.nextInt();
        int c = con.nextInt();


        int d = b * b - 4 * a * c;

        double x1 = (-b - Math.sqrt(1.0 * d)) / (2 * a);

        double x2 = (-b + Math.sqrt(1.0 * d)) / (2 * a);


        if (d == 0) {
            System.out.printf("One root: %.0f\n", x1);
        } else if (d < 0) {
            System.out.printf("No roots\n");
        } else if (x1 < x2) {
            System.out.printf("Two roots: %.0f %.0f\n", x1, x2);
        } else {
            System.out.printf("Two roots: %.0f %.0f\n ", x2, x1);
        }*/
/*
        String date1 = "23/2/34/5"; //дни/часы/минуты/секунды
        String date2 = "28/3/43/2";
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/HH/mm/ss");
        System.out.println(sdf.parse(date2 ) );
        long ms1 = sdf.parse(date1 ).getTime();
        long ms2 = sdf.parse(date2 ).getTime();

        System.out.println(Math.abs(ms2-ms1)+" "+ms2);
        System.out.println(sdf.format(Math.abs(ms1-ms2))+" "+sdf.format(ms1));

        //SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss"); // В этом формате будем вводить дату
        Date one = sdf.parse(date1); // вводим дату используя метод parse форматера
        Date two = sdf.parse(date2);
        printDifference(one, two); // Результат не зависит от последовательности аргументов
        printDifference(two, one); // Печатается "Разница между датами: 0 дней 19 часов 29 минут 50 секунд."
    */

        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd ");
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);//Jan = 0, dec = 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

//календарь на текущую дату
        Calendar calendar1 = new GregorianCalendar();
        System.out.println("Календарь на текущую дату: " + sdf.format(calendar1.getTime()));

//создайте экземпляр класса  Calendar  на 2 февраля 2020 года. С помощью методов add, roll получите дату на 8 марта 2001 года самым коротким путем.
        Calendar calendar2 = new GregorianCalendar(2020, 1, 2);
        calendar2.add(Calendar.DAY_OF_YEAR, 35); //увеличиваем дату на 1 день
        //
        System.out.println("Календарь на : " + sdf.format(calendar2.getTime()));

        //calendar2.add(Calendar.MONTH, -1);
        //System.out.println("Календарь на 26.11.2013: " + sdf.format(calendar2.getTime()));

        calendar2.roll(Calendar.YEAR, -19);
        System.out.println("Календарь после roll: " + sdf.format(calendar2.getTime()));*/

/*
        //Реализуйте приложение, которое выведет на экран дату в формате   12:20 15.01.2019.
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        Calendar calendar3 = new GregorianCalendar(2019,0,15,12,20);
        System.out.println(sdf1.format(calendar3.getTime()));*/

        printNum(1, 5);
        printNum(12, 13);
        //System.out.println(printNum(5, 0));

        //SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy"); // В этом формате будем вводить дату
        //Date one = sdf.parse("12.09.2020"); // вводим дату используя метод parse форматера
        //Date two = sdf.parse("05.01.2020");

        //printDifference(two, one); // Печатается "Разница между датами: 0 дней 19 часов 29 минут 50 секунд."
    }

    public static void printNum(int m, int d) {
        m --;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        Calendar calendarDay = new GregorianCalendar(year,m, d);

        System.out.println("Текущую дата: " + sdf.format(calendar.getTime()));
        if (calendar.after(calendarDay)) {
            System.out.println("ДР уже был в этом году. " + sdf.format(calendarDay.getTime())
                    +" Следующий будет через: ");
            calendarDay.add(Calendar.YEAR, 1); //увеличиваем год на 1
            printDifference( calendar.getTime(), calendarDay.getTime() );
        } else {
            System.out.println("ДР еще не был в этом году. " + sdf.format(calendarDay.getTime())
                    + " Будет через: ");
            printDifference( calendar.getTime(), calendarDay.getTime() );
        }
        System.out.println("------------------------------------");
        //System.out.println("calendarDay = "+  calendar.getTime());
    }


    public static void printDifference(Date first, Date second) {
        long milliseconds = Math.abs(first.getTime() - second.getTime()); // Получаем разницу модулей в миллисекундах
        long days = milliseconds / (24 * 60 * 60 * 1000); // Получаем целое кол-во дней
        milliseconds -= days * (24 * 60 * 60 * 1000); // Онимает кол-во дней в миллисекундах
        long hours = milliseconds / (60 * 60 * 1000); // Получаем целое кол-во часов
        milliseconds -= hours * (60 * 60 * 1000); // Онимает кол-во часов в миллисекундах
        long minutes = milliseconds / (1000 * 60); // Получаем целое кол-во минут
        milliseconds -= minutes * (1000 * 60); // Онимает кол-во минут в миллисекундах
        long seconds = milliseconds / (1000); // Получаем целое кол-во секунд
        //String format = "Разница между датами: %s дней %s часов %s минут %s секунд." + System.lineSeparator();
        String format = "  %s дней %s часов %s минут %s секунд." + System.lineSeparator();
        System.out.printf(format, days, hours, minutes, seconds); // печатаем результат в указанном выше формате
    }

    /*public StringBuilder SetStringBuilder(StringBuilder stringBuilder, String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
            if (i != arr.length - 1) stringBuilder.append(", ");
        }

        return stringBuilder;
    }*/

    /*private static String formatString(String str1, String str2, int number) {

        String formatted = String.format(
                "Было получено 2 строки: str1 = %s и str2 = %s, а так же одно число num = %d" , str1 , str2, number);
        return formatted;
    }*/


    /*private static String formatNumber(String num){
        String result = "";
        for (int i = 0; i < 11; i++) {
            if(i == 0) result += "+7 ";
            else if(i == 3 || i == 6) result += num.charAt(i)+" ";
            else if(i == 8) result += num.charAt(i)+" ";
            else result += num.charAt(i);
        }

        return result;
    }*/
   /* private static String formatNumber(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        String result = "+7" + " " + clean.substring(1, 4) + " " +
                clean.substring(4, 7) + " " + clean.substring(7, 9) + " " + clean.substring(9);

        return result;
    }
    private static boolean checkPhoneNumberIsCorrect(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        return clean.length() == 11;
    }*/


    /*
    private static String formatName(String name) {
        //Написать код здесь. каждое слово в имени было написано с большой буквы.
        String[] arrWords = name.split(" ");
        String result = "";
        sortByLength(arrWords);
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
    private static void sortByLength(String[] words) {
        //Написать код здесь.  т.е. отсортируйте слова в имени по длине.
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }

    }
    private static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }
    */
   /* private static boolean checkName(String name) {
        String[]  name1 = name.split(" ") ; //
        if (name1.length == 3) {
            if (name1[0].length() == 3) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Должно быть 3слова");
            return false;
        }
    }*/

    /*private static String removeWhiteSpaces (String str) {
        str = str.replaceAll(" ","");
        return  str;
    }*/

    /*public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }*/
    /*public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        int l = 0;
        int r = clean.length();
        int m = (l + r) / 2;
        System.out.println(m);
        char[] array1 = new char[m];
        char[] array2 = new char[m];
        for (int i = 0; i < m; i++) {
            array1[i] = clean.charAt(i);
        }
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < m; i++) {
            array2[i] = clean.charAt(r - 1 - i);
        }
        System.out.println(Arrays.toString(array2));
        return Arrays.equals(array1, array2);
    }*/

    /*private static String removeWhiteSpaces(String str) {
        //char[] result = new char[str.length()];
        String stAll = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                stAll = stAll + str.charAt(i);
            }
        }
        return stAll;
    }*/


    /*private static char[] concat(String str1, String str2) {
        char[] result = new char[str1.length()+str2.length()];
        String stAll = str1 +" "+ str2;
        for (int i = 0; i < result.length; i++) {
            result[i] = stAll.charAt(i);
        }
        return result;
    }*/


    /*public static void print2DArray(String[][] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                str = str + array[i][j] + " ";
            }
            System.out.println(str);
            str = "";
        }
    }*/

    public static void swap(int[] arr, int a, int b) {

        boolean ZeroArr = a >= 0 && b >= 0;
        boolean LastArr = a < arr.length && b <= arr.length;

        if (ZeroArr && LastArr) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        } else {
            System.out.println("цифры не подходят");
        }

    }


    public Test() {
        First_method();
    }

    public String Second_method() {
        return "Hello";
    }

    public void First_method() {
        String out = Second_method();
        System.out.println(out);
    }
}


