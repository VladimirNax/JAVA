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

    public int getNumber() {
        return number;
    }

    public String getTextTask() {
        return textTask;
    }

    public Task(int number, String textTask) {
        this.number = number;
        this.textTask = textTask;
    }

    //abstract void task();
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

    public DragAndDrop(int number, String textTask) {
        this(number, textTask, new String[][]{
                {"a", "b", "c"},
                {"a", "b"},
                {"a", "c"},
                {"a", "b", "c","d"}
        });
    }



    public DragAndDrop(int number, String textTask, String[][] options) {
        super(number, textTask);
        this.options = options;
    }

    /*@Override
    public void performTask() {

    }*/
        /*@Override
    void task() {

    }*/
}

class Code extends Task{

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