package shapes;


public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(double length, double width) {
        super(length, width);
    }

    public static void main(String[] args){}

    @Override
    public double getPerimeter() {
        return (super.length * 2) + (super.width *2);
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return (2 * this.length) + (2 * this.width);
//    }
//
//    public double getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }
}
