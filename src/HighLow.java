public class HighLow {

    static int randomNumber = MethodsExercises.getRandomNumber(1, 100);

    public static int promptGuess() {
        System.out.println("Would you kindly take a guess?");
        int usersGuess = MethodsExercises.getInteger(1, 100);
        return usersGuess;
    }

    public static void highLowGame() {
        int randomNumber = MethodsExercises.getRandomNumber(1, 100);
        int userLastGuess;

        do{
            userLastGuess = promptGuess();

            if(userLastGuess > randomNumber) {
                System.out.println("LOWER!!!");
            } else if(userLastGuess < randomNumber) {
                System.out.println("HIGHER!!!");
            }

        } while (userLastGuess != randomNumber);

        System.out.println("GOOD GUESS!!");


    }

    public static void main(String[] args) {

        highLowGame();
    }
}
