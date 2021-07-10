package util;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public static String getString() {
        System.out.println("Please enter a string.");
        return scanner.nextLine();
    }
    public static boolean yesNo() {
        System.out.println("Yes or No (y/n)");
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("yes" ) || userInput.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }
    public static int getInt(int min, int max) {
        System.out.printf("Please enter a number between %d and %d", min, max);
        int numberGiven = scanner.nextInt();
        if (numberGiven >= min && numberGiven <= max) {
            return numberGiven;
        } else {
            return getInt(min, max);
        }
    }
    public static int getInt() {
        System.out.println("Please enter a number");
        return scanner.nextInt();
    }
    public static double getDouble(double min, double max) {
        double numberGiven;
        do {
            System.out.printf("Please enter a number between %.02f and %.02f \n", min, max);
            numberGiven = scanner.nextDouble();

        } while(numberGiven < min || numberGiven > max);
        return numberGiven;
    }
    public static double getDouble() {
        System.out.println("Please enter a double number");
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        System.out.println(Input.getString());
        System.out.println(Input.yesNo());
        System.out.println(Input.getInt(1,5));
        System.out.println(Input.getInt());
        System.out.println(Input.getDouble(1.1,5.5));
        System.out.println(Input.getDouble());
    }
}
