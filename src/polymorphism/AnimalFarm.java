package polymorphism;

public class AnimalFarm extends Animal{

    public static final int MAX_FARM_ANIMALS = 4;
    public static void main(String[] args) {

        // Polymorphism allows a variable of one type
        // to act like different subclasses
        //Example: bleat like goat, oink like pig, etc.

        Animal genericAnimal = new Animal();
        genericAnimal.makeNoise();

        Goat woodrow = new Goat();
        woodrow.makeNoise();

        Pig piglet = new Pig();
        piglet.makeNoise();

        Cat pussNBoots = new Cat();
        pussNBoots.makeNoise();

        genericAnimal = new Goat();
        genericAnimal.makeNoise();

        genericAnimal = new Pig();
        genericAnimal.makeNoise();

        genericAnimal = new Cat();
        genericAnimal.makeNoise();

        Cat tabby = new Cat();
        tabby.purr();//Purr can only being called through Cat class due to exclusivity



    }
}
