package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
//        System.out.println("Type Something: ");
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo() {
//        System.out.println("Select (y/n):");
        String userAnswer = scanner.next();
        scanner.nextLine();
        return userAnswer.equals("y");
    }

    public int getInt(int min, int max) {
        String s = getString();
        try{
            Integer.valueOf(s);
        } catch(NumberFormatException e){
            System.out.println("Error: Input is not an integer!");
            return getInt(min, max);
        }

        int number = Integer.parseInt(s);
        if(number >= min && number <= max){
            return number;
        }
        else{
            System.out.println("Error: Choice Not Recognized!");
            return getInt(min, max);
        }
    }

    public int getInt() {
        String s = getString();
        try{
            return Integer.valueOf(s);
        } catch (NumberFormatException e){
            System.out.println("Error: Input is not an integer!");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        String s = getString();
        try{
            Double.valueOf(s);
        } catch(NumberFormatException e){
            System.out.println("Error: Input is not a double!");
            return getDouble(min, max);
        }

        double number = Double.parseDouble(s);
        if(number >= min && number <= max){
            return number;
        }
        else{
            System.out.println("Error: Number not in range");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        String s = getString();
        try{
            return Double.valueOf(s);
        } catch(NumberFormatException e){
            System.out.println("Error: Input is not a double!");
            return getDouble();
        }
    }


}