public class Student extends Person {

    public int solvedProblems; // количество решенных задач
    public static int taskCountForAll; // Количество решенных задач всеми студентами
    public Mentor mentor; // Ментор
    public boolean allTasks; // Флаг, что студент решил все задания


    public Student(String name, int age, boolean allTasks) {

        this(name, age, 0, allTasks);
    }

    public Student(String name, int age, int solvedProblems, boolean allTasks) {
        super(name, age);
        this.solvedProblems = solvedProblems;
        this.allTasks = allTasks;
    }

    public int getSolvedProblems() {
        return solvedProblems;
    }

    public void setSolvedProblems(int solvedProblems) {
        this.solvedProblems = solvedProblems;
    }

    public static int getSumSolvedProblems() {
        return taskCountForAll;
    }

    public static void setSumSolvedProblems(int taskCountForAll) {
        Student.taskCountForAll = taskCountForAll;
    }

    public boolean isAllTasks() {
        return allTasks;
    }

    public void setAllTasks(boolean allTasks) {
        this.allTasks = allTasks;
    }


    // метод Решить задачи
    public void solveTasks(int numberTasks, Task[] tasks) {

    }

    //Решить задачу
    private void solveProblem() {


    }


}
