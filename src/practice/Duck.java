package practice;

public class Duck {
    private String name;
    private int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
        if (name == null) {
            throw new IllegalArgumentException("That is not a name");
        }
    }

    public static void main(String[] args) {

        Duck duck1 = new Duck(null, 2);
        System.out.println(duck1);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
