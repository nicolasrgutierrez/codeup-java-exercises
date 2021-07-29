public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        int favNumber = 7;

        System.out.println(favNumber);
        //
         String myString = "Howdy, Howdy, Howdy";
        // String myString = 'Howdy, Howdy, Howdy'; error
        // String myString = 3.14159; error

        System.out.println(myString);
        //
        // long myNumber = ; Illegal start of expression
        // long myNumber = 3.14; Incompatible types
         long myNumber = 123;
        // float myNumber = 3.14; Possible lossy conversion from double to float

        System.out.println(myNumber);
        //
        // int x = 5;
        // System.out.println(x++); Increments
        // System.out.println(x);

        // int x = 5;
        // System.out.println(++x); Decrements
        // System.out.println(x);
        //

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;

    }
}
