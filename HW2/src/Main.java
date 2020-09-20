import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /*System.out.println( rand(500,1500) );

        Student[] student = new Student [5];
        student[0] = new Student("Олег", 21, false);
        student[1] = new Student("Иван", 52, false);
        student[2] = new Student("Николай", 32, false);
        student[3] = new Student("Игорь", 15, false);
        student[4] = new Student("Влад", 25, false);

        Mentor mentor1 = new Mentor("Bot_mentor_1", 5);
        Mentor mentor2 = new Mentor("Bot_mentor_2", 5);

        Task[] tasks = new Task[50];
        tasks[0] = new Test(0,"") ;
        tasks[1] = new DragAndDrop(0,"") ;
        tasks[2] = new Code(0,"") ;


        System.out.println(mentor1.getName() +" student: "+ student[2].getName());
        System.out.println(tasks[0]);*/
        //Task[] tasks = generateTasks();

        Mentor Mentor1 = new Mentor("Влад Д.", 22);
        Mentor Mentor2 = new Mentor("Олег П.", 15);

        Student[] students = new Student[4];

        students[0] = new Student("Олег", 21, Mentor1,2);
        students[1] = new Student("Иван", 52, Mentor1);
        students[2] = new Student("Николай", 32, Mentor2);
        students[3] = new Student("Игорь", 15, Mentor2);

        /*while (!doesNotEachStudentSolveAllTasks(students)) {
            /*for (int i = 0; i < students.length - 1; i++) {
                Student students = students[i];
            }*//*
            System.out.println("while");
            for (Student student : students) {
                int tasksToSolve = randomInt(5, tasks.length - 1);
                student.solveTasks(tasksToSolve , tasks);
            }
        }*/

        Task[] task = new Task[3];
        task[0]  = new Test(1, "Test Task text");
        task[1]  = new DragAndDrop(3, "DragAndDrop ");
        task[2]  = new Code(2, "Code Task ");
        students[0].solveTasks(3 , task);
        /*students[0].setAllTasks(true);
        students[0].solveTasks(3 , task);*/




    }

    private static boolean doesNotEachStudentSolveAllTasks(Student[] students) {
        boolean done = true;
        for(Student student : students){
            boolean d = student.allTasks;
            done &= d;
        }
        return done;

    }

    //private static Task[] generateTasks() {
    //    Task[] tasks = new Task[7];
    //    for (int i = 0; i < 7; i++) {
    //        Task t = new Test(i + 1, "Test Task " + (i + 1) + "text");
    //        tasks[i] = t;
    //    }
    //    /*for (int i = 7; i < 18; i++) {
    //        Task t = new DragAndDrop(i + 1, "DragAndDrop Task" + (i + 1) + "text");
    //        tasks[i] = t;
    //    }
    //    for (int i = 18; i < 31; i++) {
    //        Task t = new Code(i + 1, "Write Code Task " + (i + 1) + " text");
    //        tasks[i] = t;
    //    }*/
    //    return tasks;
    //}

    public static int randomInt(int min, int max) {
        Random random = new Random();
        int diff = max - min;
        int result = random.nextInt(diff + 1);
        result += min;
        return result;
    }
    /*public static int rand(int min, int max) {
        Random random = new Random();
        int  diff = max - min;
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }*/
}
