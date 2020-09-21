abstract class Task {
    /*
    Класс описывает задачу, которая даётся студенту для решения.
    Во всех заданиях по желанию вы можете реализовать свой собственный
    конструктор и инициализировать задание с его помощью.
    */

    private int number; // Номер
    private  String textTask; // Текст задание

    /*public Task() {
        this(0, "Начальная задача для студента. Введение");
    }*/


    public Task(int number, String textTask) {
        this.number = number;
        this.textTask = textTask;
    }

    public String getTextTask() {
        return textTask;
    }
    public int getNumber() {
        return number;
    }
}


class Test extends Task implements AutoChecked {

    String[] answers; // Массив с ответами


    public Test(int number, String textTask) {
        this(number, textTask, new String[]{"a", "b", "c"});
    }



    public Test(int number, String textTask, String[] answers) {
        super(number, textTask);
        this.answers = answers;
    }


}

class DragAndDrop extends Task implements AutoChecked {

    private String[][] options; //Массив с вариантами ответов

    //public DragAndDrop(int number, String textTask) {
    //    this(number, textTask, new String[][]{
    //            {"a", "b"},
    //            {"a", "b"},
    //            {"a", "c"},
    //            {"a", "b"}
    //    });
    //}

    public DragAndDrop(int number, String textTask ) {
        super(number, textTask);
        this.options = new String[2][2];
        options[0][0] = "вариант1";
        options[0][1] = "вариант2";
        options[1][0] = "вариант3";
        options[1][1] = "вариант4";
    }

}

class Code extends Task {

    String codText; //Текст кода

    public Code(int number, String textTask) {
        this(number, textTask, "Введите код");
    }

    public Code(int number, String textTask, String codText) {
        super(number, textTask);
        this.codText = codText;
    }

}