package exceptions;
import util.Input;
import java.util.InputMismatchException;

public class ExceptionsLecture {
   public static void foo() throws Exception{

           throw new Exception("Hey, something bad happened!");

   }


    public static void main(String[] args) {
        // int [] myArray = {1, 2, 3, 4, 5};

        //System.out.println(myArray[5]);
        //throw new Exception("hello world");
//        try {
////            Input input = new Input();
////            System.out.println("Enter an int: ");
////            input.getInt();
//            //int result = 1 / 2;
//            throw new Exception("hello world");
//
//        }  catch(Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally is executing!");
//            //finally will execute, even if any of the catches do
//        }
//
        try{
            foo();
        }catch(Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        System.out.println("End of program");


    }
}