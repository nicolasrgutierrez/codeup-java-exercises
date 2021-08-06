package polymorphism;

public class Cat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("That's not what your mama said!");
    }

    public void purr() {
        System.out.println("Purrrrrrr");
    }
}
