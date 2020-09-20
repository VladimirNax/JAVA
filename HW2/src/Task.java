abstract class Task {
    /*
    Класс описывает задачу, которая даётся студенту для решения.
    Во всех заданиях по желанию вы можете реализовать свой собственный
    конструктор и инициализировать задание с его помощью.
    */

    public int number; // Номер
    public  String textTask; // Текст задание

    public Task() {
        this(0, "Начальная задача для студента. Введение");
    }


    public Task(int number, String textTask) {
        this.number = number;
        this.textTask = textTask;
    }


}

class Test extends Task implements AutoChecked {

    public String[] answers; // Массив с ответами


    public Test(int number, String textTask) {
        this(number, textTask, new String[]{"a", "b", "c"});
    }



    public Test(int number, String textTask, String[] answers) {
        super(number, textTask);
        this.answers = answers;
    }

    /*@Override
    public void performTask() {

    }
    @Override
    void task() {

    }*/
}

class DragAndDrop extends Task implements AutoChecked {

    public String[][] options; //Массив с вариантами ответов

    /*public DragAndDrop(int number, String textTask) {
        this(number, textTask, new String[][]{
                {"a", "b"},
                {"a", "b"},
                {"a", "c"},
                {"a", "b"}
        });
    }*/



    public DragAndDrop(int number, String textTask ) {
        super(number, textTask);
        this.options = new String[2][2];
        options[0][0] = "вариант1";
        options[0][1] = "вариант2";
        options[1][0] = "вариант3";
        options[1][1] = "вариант4";
    }

    /*@Override
    public void performTask() {

    }*/
        /*@Override
    void task() {

    }*/
}

class Code extends Task implements AutoChecked{

    public String codText; //Текст кода

    public Code(int number, String textTask) {
        this(number, textTask, "Введите код");
    }

    public Code(int number, String textTask, String codText) {
        super(number, textTask);
        this.codText = codText;
    }
        /*@Override
    void task() {

    }*/
}