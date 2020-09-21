public class Student extends Person {


    public static int taskCountForAll; // Количество решенных задач всеми студентами

    public int solvedTasks; // количество решенных задач
    public Mentor mentor; // Ментор
    public boolean allTasks = false; // Флаг, что студент решил все задания

    public Student(String name, int age , Mentor mentor) {
        this(name, age, mentor, 0);

    }
    public Student(String name, int age , Mentor mentor, int solvedTasks) {
        super(name, age);
        this.solvedTasks = solvedTasks;
        this.mentor = mentor;
    }

    public void setAllTasks(boolean allTasks) {
        this.allTasks = allTasks;
    }




    // метод Решить задачи
    public void solveTasks(Task[] tasks,int numberTasks) {
        System.out.println("Студент[" + getName() + "]:  уже было решено ["+solvedTasks+"],  всего задач ["+ numberTasks+"] ");
        for (int i = solvedTasks; i < numberTasks; i++) {
            solveTask(tasks[i]);
            if (solvedTasks >= tasks.length) {
                allTasks = true;
                System.out.println("[" + getName() + "] завершил все задания!");

            } else {
                allTasks = false;
                //System.out.println("не все задачи решены");
            }

        }
    }

    //Решить задачу
    private void solveTask(Task task) {
        if (task instanceof AutoChecked) {
            ((AutoChecked) task).taskCompleted();
            //while (!mentor.checkCode(task)) {}
        } else {
            while (!mentor.checkCode(task)) {}
            //((AutoChecked) task).taskCompleted();
        }
        solvedTasks++;
        taskCountForAll++;
    }



}
