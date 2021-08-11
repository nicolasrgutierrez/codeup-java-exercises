package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
      double sum = 0;

      for(int grade : grades) {
          sum += grade;
      }
      return (sum / grades.size());
    }

    public static void main(String[] args) {
        Student studentOne = new Student("Momo");

        studentOne.addGrade(99);
        studentOne.addGrade(92);
        studentOne.addGrade(100);
        studentOne.addGrade(90);
        studentOne.addGrade(97);

        System.out.printf("%s's grade average is %.2f.", studentOne.getName(), studentOne.getGradeAverage());


    }
}
