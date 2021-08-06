package polymorphism;

public class Animal {
//Adding final to class means you CAN NOT sub-class it

    public void makeNoise() {
        //Can not add final here or you cancel out method overloading
        System.out.println("...");
    }
}
