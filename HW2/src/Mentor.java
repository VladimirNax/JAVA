import java.util.Random;

public class Mentor extends Person implements Staff {

    private boolean mood; // Настроение ментора
    private Random random = new Random();

    public Mentor(String name, int age) {
        this(name, age, true);
    }

    public Mentor(String name, int age, boolean mood) {
        super(name, age);
        this.mood = mood;
    }

    @Override
    public void helpStudent(Student student) {
        System.out.println(student.getName() + "Молодец. гугл в помощь тупарь!");
    }


    public boolean checkCode(Task tasks) {

        /*if(rand(500,1500)>1000){
            System.out.println("задача принята");
            return true;
        } else {
            System.out.println("Задача №" +tasks.getNumber()+ "не принято");
            return false;
        }*/
        int number = Main.rand(0, 2000);
        if (number > 1000) {
            mood = true;
            System.out.println("[" + tasks.getTextTask() + "] Задачу принял [" + getName() + "]") ;
            return true;
        }
        mood = false;
        System.out.println("[" + tasks.getTextTask() + "] Задача №"+tasks.getNumber()+ " не принята [" + getName() + "]");
        //giveAdditionalMaterials();
        return false;

        /*mood = true;
        System.out.println("[" + tasks.textTask + "] был проверен [ " + getName() + " ]") ;
        return true;*/




    }

    public static int rand(int min, int max) {
        Random random = new Random();
        int  diff = max - min;
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }
}
