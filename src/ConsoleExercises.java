import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f%n", pi);
        //

        //Scanner scanner = new Scanner(System.in);
        //
        //System.out.print("Enter a integer: ");
        //while (scanner.hasNext()) {
        //    if(scanner.hasNextInt()) {
        //        System.out.println("You entered: --> \"" + scanner.nextInt() + "\" <--");
        //    }
        //    System.out.println(scanner.next() + " is NOT an integer!");
        //}
        //scanner.close();
        //
        //Scanner scannerTwo = new Scanner(System.in);
        //
        //System.out.print("Give me 3 words: ");
        //String userWordOne = scannerTwo.next();
        //String userWordTwo = scannerTwo.next();
        //String userWordThree = scannerTwo.next();
        //
        //System.out.print("First Word: " + userWordOne + "\n" + "Second Word: " + userWordTwo + "\n" + "Third Word: " + userWordThree);
        //
        //scannerTwo.close();
        //
        //Scanner scannerThree = new Scanner(System.in);
        //
        //System.out.print("How 'bout a full sentence: ");
      //String userSentence = scannerThree.next();
        //String userSentence = scannerThree.nextLine();
        //System.out.print(userSentence);
        //
        //scannerThree.close();

        Scanner area = new Scanner(System.in);

        System.out.print("What is the length of a classroom at Codeup? ");

        double length = Double.parseDouble(area.nextLine());

        System.out.print("What is the width of a classroom at Codeup? ");

        double width = Double.parseDouble(area.nextLine());

        double classArea = length * width;
        double perimeter = (length * 2) * (width * 2);

        System.out.print("Area: " + classArea);
        System.out.print("Perimeter: " + perimeter);

    }
}
