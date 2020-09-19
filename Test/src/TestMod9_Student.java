import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class TestMod9_Student {
    private static String addCommand = "add Василий Петров " +
            "vasily.petrov@gmail.com +79787775747";
    private static String commandExamples = "\t" + addCommand + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static String commandError = "Wrong command! Available command examples: \n" +
            commandExamples;
    private static String helpText = "Command examples:\n" + commandExamples;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StudentStorage executor = new StudentStorage();
        while (true) {
            String command = scanner.nextLine();
            String[] tokens = command.split("\\s+", 2);
            if (tokens[0].equals("add")) {
                try  {
                    executor.addStudent(tokens[1]);
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                }
            } else if (tokens[0].equals("list")) {
                executor.listStudent();
            } else if (tokens[0].equals("get")) {
                try {
                    executor.getStudentByName(tokens[1]).toString();
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                }catch (NullPointerException e) {
                    System.out.println(e);
                }
            } else if (tokens[0].equals("remove")) {
                try {
                    executor.removeStudent(tokens[1]);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                }
            } else if (tokens[0].equals("count")) {
                System.out.println("There are " + executor.getCount() + " customers");
            } else if (tokens[0].equals("help")) {
                System.out.println(helpText);
            } else {
                System.out.println(commandError);
            }
        }

    }
}

class StudentStorage {
    private HashMap<String, Student> storage;

    public StudentStorage() {
        storage = new HashMap<>();
    }

    public void addStudent(String data) {
        String[] components = data.split("\\s+");
        String name = components[0] + " " + components[1];
        storage.put(name, new Student(name, components[3], components[2]));
    }

    public void listStudent() {
        storage.values().forEach(System.out::println);
    }

    public void removeStudent(String name) {
        storage.remove(name);
    }

    public Student getStudentByName(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}
class Student {

    /**
     * id студента
     */
    private String id;

    /**
     * Имя студента
     */
    private String name;

    /**
     * Телефон студента
     */
    private String phone;

    /**
     * Почта студента
     */
    private String eMail;

    public Student(String name, String phone, String eMail) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}