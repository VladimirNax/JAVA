import java.util.Random;

public class Mentor extends Person implements Staff {

    public boolean mood; // Настроение ментора
    public Random random = new Random();

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
        int number = Main.randomInt(0, 2000);
        if (number > 1000) {
            mood = true;
            System.out.println("[" + tasks.textTask + "] Был проверен [" + getName() + "]") ;
            return true;
        }
        mood = false;
        System.out.println("[" + tasks.textTask + "] Задача №"+tasks.number+ " не принята [" + getName() + "]");
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
