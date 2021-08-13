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

        String string = getString();

        try{
            Integer.valueOf(string);
        } catch(NumberFormatException e){
            System.out.println("Error: Input is not an integer!");
            return getInt(min, max);
        }

        int number = Integer.parseInt(string);
        if(number >= min && number <= max){
            return number;
        }
        else{
            System.out.println("Error: Choice Not Recognized!");
            return getInt(min, max);
        }
    }

    public int getInt() {

        String string = getString();

        try{
            return Integer.valueOf(string);
        } catch (NumberFormatException e){
            System.out.println("Error: Input is not an integer!");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        String string = getString();
        try{
            Double.valueOf(string);
        } catch(NumberFormatException e){
            System.out.println("Error: Input is not a double!");
            return getDouble(min, max);
        }

        double number = Double.parseDouble(string);
        if(number >= min && number <= max){
            return number;
        }
        else{
            System.out.println("Error: Number not in range");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        String string = getString();
        try{
            return Double.valueOf(string);
        } catch(NumberFormatException e){
            System.out.println("Error: Input is not a double!");
            return getDouble();
        }
    }

    public int getBinary() {
        System.out.println("Enter a binary number: ");
        try{
            return Integer.valueOf(this.getString(), 2);
        } catch (NumberFormatException e) {
            System.out.println("That is not a binary number!");
            return getBinary();
        }
    }

    public int getHex() {
        System.out.println("Enter a hexadecimal number: ");
        try{
            return Integer.valueOf(this.getString(), 16);
        }catch (NumberFormatException e) {
            System.out.println("That is not a hexadecimal number!");
            return getHex();
        }
    }
}