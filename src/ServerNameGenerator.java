import java.util.Random;

public class ServerNameGenerator {

    static String[] adjectives = {"adorable", "bewildered", "clumsy", "delightful", "energetic", "frantic", "graceful", "helpless", "inquisitive", "lucky"};

    static String[] nouns = {"barbarian", "rogue", "monk", "cleric", "paladin", "fighter", "druid", "bard", "ranger", "warlock"};

    public static String randomElement(String[] input) {
        Random random = new Random();
        int randomTwo = random.nextInt(input.length);
        return input[randomTwo];
    }
    public static void main(String[] args) {
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }
}
