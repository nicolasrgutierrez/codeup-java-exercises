import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        Will not print properly without Arrays.toString

        Person[] people = new Person[3];

        people[0] = new Person("Midoriya");
        people[1] = new Person("Bakugo");
        people[2] = new Person("Todoroki");

        for(int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        people = addPerson(people, new Person("Iida"));
        //Enhanced for loop is READ ONLY and has no access to index
        for(Person person : people) {
            System.out.println(person.getName());
        }
    }
        public static Person[] addPerson(Person[] people, Person personToAdd) {
            Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
            newPeopleArray[newPeopleArray.length - 1] = personToAdd;

            return newPeopleArray;
        }

}
