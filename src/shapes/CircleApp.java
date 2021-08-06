package shapes;
import util.Input;
public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("What is the radius of your circle?");
        double radius = input.getDouble();

        Circle userCircle = new Circle(radius);

        double circleArea = userCircle.getArea();
        double circleCircumference = userCircle.getCircumference();

        System.out.printf("The area of your circle equals %f%n and the circumference of your circle equals %f%n", circleArea, circleCircumference);

    }
}
