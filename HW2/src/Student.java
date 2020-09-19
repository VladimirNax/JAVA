public class Student extends Person {

    public int solvedTasks; // количество решенных задач
    public static int taskCountForAll; // Количество решенных задач всеми студентами
    public Mentor mentor; // Ментор
    public boolean allTasks = false; // Флаг, что студент решил все задания


    public Student(String name, int age, boolean allTasks) {

        this(name, age, 0, allTasks);
    }

    public Student(String name, int age, int solvedTask, boolean allTasks) {
        super(name, age);
        this.solvedTasks = solvedTask;
        this.allTasks = allTasks;
    }

    public int getSolvedTask() {
        return solvedTasks;
    }

    public void setSolvedTask(int solvedProblems) {
        this.solvedTasks = solvedProblems;
    }

    public boolean isAllTasks() {
        return allTasks;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }



    // метод Решить задачи
    public void solveTasks(int numberTasks, Task[] tasks) {

        for (int i = getSolvedTask(); i < numberTasks; i++) {
            solveTask(tasks[i]);
            if (solvedTasks >= tasks.length) {
                allTasks = true;
                System.out.println("[" + getName() + "] solved all tasks!");
            } else {
                allTasks = false;
            }

        }
    }

    //Решить задачу
    private void solveTask(Task task) {
        if (task instanceof AutoChecked) {
            ((AutoChecked) task).taskCompleted();
        } else {
            while (!mentor.checkCode(task)) {
            }
        }
        solvedTasks++;
        taskCountForAll++;
    }


}
