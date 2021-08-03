import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean userTalk = true;

        do {
            System.out.println("Why not try talking to Bob?");
            String userString = scanner.nextLine();
            if (userString.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userString.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if (userString.endsWith(" ")){
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
        }while(userTalk);
    }
}
