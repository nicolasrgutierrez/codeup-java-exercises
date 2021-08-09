package shapes;

public class Square extends Quadrilateral {

    protected double side;

    public Square(double side){
        super(side, side);
    }

    public static void main(String[] args){}

    @Override
    public double getPerimeter() {
        return super.length * 4;
    }

    @Override
    public double getArea() {
        return super.length * super.length;
    }


//    private double side;
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        return side * side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return side * 4;
//    }
}
