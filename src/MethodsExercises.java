import java.util.Scanner;
public class MethodsExercises {
    public static double Addition(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static double Subtraction(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public static double Multiplication(double numberOne, double numberTwo) {
        return numberOne * numberTwo;

        // Sam Demo for bonus
        //  double totalAdded = 0;
        //  for (int i = 0; i < numberTwo; i++) {
        //      totalAdded += numberOne;
        //  }
    }

    public static double Division(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    public static double Modulus(double numberOne, double numberTwo) {
        return numberOne % numberTwo;
    }


    public static int getInteger(int min, int max) {
        Scanner userInt = new Scanner (System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput = userInt.nextInt();

        if(userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println(userInput + " does not work!");
            return getInteger(min, max);
        }
        //  Sam Demo of loop solution
        //do {
        //    System.out.print("Enter a number between " + min + " and " + max + ": ");
        //    int userInput = userInt.nextInt();
        //} while(!(userInput >= min && userInput <= max));
        //return userInput;
    }





    public static void main(String[] args) {

        System.out.println(Addition(55,62));
        System.out.println(Subtraction(10,5));
        System.out.println(Multiplication(7, 49));
        System.out.println(Division(77, 7));
        System.out.println(Modulus(45, 5));

        System.out.println(getInteger(5, 25));
    }
}
