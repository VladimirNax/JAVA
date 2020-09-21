import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Mentor Mentor1 = new Mentor("Влад Д.", 22);
        Mentor Mentor2 = new Mentor("Олег П.", 15);

        Student[] students = new Student[4];

        students[0] = new Student("Олег", 21, Mentor1,rand(0,6));
        students[1] = new Student("Иван", 52, Mentor1,rand(0,6));
        students[2] = new Student("Николай", 32, Mentor2,rand(0,6));
        students[3] = new Student("Игорь", 15, Mentor2,rand(0,6));

        Task[] tasks = new Task[35];
        for (int i = 0; i < tasks.length; i++) {
            int t = rand(1,3); int d = rand(1,3);
            if(t == 1 || d == 2 ) {
                if(t == 1)tasks[i] = new Test(rand(1,10),"Test text");
                if(d == 2)tasks[i]  = new DragAndDrop(rand(1,10), "DragAndDrop ");
            } else {
                tasks[i] = new Code(rand(1,10), "Code Task ");
            }
        }

        boolean go = false;
        while (!go) {
            for (int i = 0; i < students.length; i++) {
                students[i].solveTasks(tasks, tasks.length);
                System.out.println("----------------------------------");
            }

            go = students[students.length-1].allTasks;

        }
        /*Task[] task = new Task[3];
        task[0]  = new Test(0,"Test Task text");
        task[1]  = new DragAndDrop(0, "DragAndDrop ");
        task[2]  = new Code(rand(1,10), "Code Task ");
        students[1].solveTasks(task, task.length );*/
        /*students[0].setAllTasks(true);
        students[0].solveTasks(3 , task);*/





    }


    public static int rand(int min, int max) {
        Random random = new Random();
        int  diff = max - min;
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }
}
