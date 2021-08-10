package movies;
import util.Input;
import java.util.Scanner;
public class MoviesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean moviesRunning = true;
        do {
            System.out.println("What would you like to do? \n\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n");
            int userInput = scanner.nextInt();

            if (userInput == 0) {
                moviesRunning = false;
                System.out.println("See you next time!");
            }
            if (userInput == 1) {
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
            }
            if (userInput == 2) {
                System.out.println(getCategory("animated"));
            }
            if (userInput == 3) {
                System.out.println(getCategory("drama"));
            }
            if (userInput == 4) {
                System.out.println(getCategory("comedy"));
            }
            if (userInput == 5) {
                System.out.println(getCategory("scifi"));
            }
        }while (moviesRunning) ;

    }

//    static void  displayMenu(){
//        String menu = "What would you like to do? \n\n" +
//                "0 - exit\n" +
//                "1 - view all movies\n" +
//                "2 - view movies in the animated category\n" +
//                "3 - view movies in the drama category\n" +
//                "4 - view movies in the horror category\n" +
//                "5 - view movies in the scifi category\n";
//    }

    public static String getCategory(String category) {
        String result = "";
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                result += movie.getName() + " | " + movie.getCategory() + "\n";
            }
        }
        return result;
    }
}