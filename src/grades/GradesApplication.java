package grades;

import java.util.HashMap;

public class GradesApplication {

    public static int randomGrade(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Uraraka");
        Student student2 = new Student("Kirishima");
        Student student3 = new Student("Mineta");
        Student student4 = new Student("Jiro");

        for (int i = 0; i <= 3; i++) {
            student1.addGrade(randomGrade(50, 100));
            student2.addGrade(randomGrade(50, 100));
            student3.addGrade(randomGrade(50, 100));
            student4.addGrade(randomGrade(50, 100));
        }

        students.put("Ocho8", student1);
        students.put("RedRiot23", student2);
        students.put("Grape0", student3);
        students.put("Amp11", student4);

        System.out.println("Welcome students of UA!");
        System.out.println("Here are the GitHub usernames of our students: ");

        for (String key : students.keySet()) {
            System.out.printf("|%s| ", key);

        }

    }
}
