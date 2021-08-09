package shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape2 = new Rectangle(4, 5);
        System.out.println("Perimeter: " + myShape2.getPerimeter());
        System.out.println("Area: " + myShape2.getArea());

        Measurable myShape = new Square(5);
        System.out.println("Perimeter: " + myShape.getPerimeter());
        System.out.println("Area: " + myShape.getArea());
//        Rectangle box1 = new Rectangle(5, 4);
//
//        double recPerimeter = box1.getPerimeter();
//        double recArea = box1.getArea();
//        System.out.printf("Perimeter: %f%nArea: %f%n", recPerimeter, recArea);
//
//        Rectangle box2 = new Square(5);
//        double sqPerimeter = box2.getPerimeter();
//        double sqArea = box2.getArea();
//        System.out.printf("Box 2 Perimeter: %f%nBox 2 Area: %f%n", sqPerimeter, sqArea);

    }
}
