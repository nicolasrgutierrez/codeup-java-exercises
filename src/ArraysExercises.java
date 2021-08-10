public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        Will not print properly without Arrays.toString

        Person[] people = new Person[3];

        people[0] = new Person("Mike");
        people[1] = new Person("Scott");
        people[2] = new Person("Trevor");

        for(Person person : people) {
            System.out.println(person.getName());
        }

    }

}
