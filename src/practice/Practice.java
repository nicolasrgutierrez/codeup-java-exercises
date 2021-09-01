package practice;

public class Practice {

    public static double multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static void getMallardDetails(Mallard mallard) {
        System.out.printf("The Mallard %s flies at %s miles per hour.", mallard.getName(), mallard.getFlyspeed());
    }

    public static void main(String[] args) {
        System.out.println(multiply(4.75,5.1));

        Mallard mallard1 = new Mallard("fred", 1, 10);
        getMallardDetails(mallard1);
    }
}
