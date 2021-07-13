package util;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Random;
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

    // overload to the yesNo function so I am able to call and switch the prompt so it can be used in any aspect by changing the sentence to the appropriate content
    public static boolean yesNo(String promptText) {
        System.out.println(promptText);
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("yes" ) || userInput.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean yesNo() {
        return yesNo("Yes or No (y/n)");
    }
    public static int getInt(int min, int max) {
       return getInt(min, max, "Please enter a number between %d and %d");
    }
    public static int getInt(int min, int max, String promptText) {
        System.out.printf(promptText, min, max);
        int numberGiven = scanner.nextInt();
        if (numberGiven >= min && numberGiven <= max) {
            return numberGiven;
        } else {
            return getInt(min, max, promptText);
        }
    }
    public static int getInt() {
        return getInt("Please enter a number");
    }
    public static int getInt(String promptText) {
        System.out.println(promptText);
        return scanner.nextInt();
    }


    public static double getDouble(double min, double max, String promptText) {
        double numberGiven;
        do {
            System.out.printf(promptText, min, max);
            numberGiven = scanner.nextDouble();

        } while(numberGiven < min || numberGiven > max);
        return numberGiven;
    }
    public static double getDouble(double min, double max) {
        return getDouble(min, max, "Please enter a number between %.02f and %.02f \n");
    }
    public static double getDouble() {
      return getDouble("Please enter a double number");
    }
    public static double getDouble(String promptText) {
        System.out.println(promptText);
        return scanner.nextDouble();
    }

    public static double[] makeArrayOfDoubles (int length, boolean fillWithRandoms, int maxFillNumber) {
        double[] numbers = new double[length];
        if (fillWithRandoms){
            Random random = new Random();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextDouble()* maxFillNumber;


            }
        }
        return numbers;
    }

    public static double[] makeArrayOfDoubles(int length, boolean fillWithRandoms) {
        return makeArrayOfDoubles(length, fillWithRandoms, 10);
    }


    public static double[] makeArrayOfDoubles(int length) {
        return makeArrayOfDoubles(length, false, 10);
    }
    
    public static int[] makeArrayOfInts (int length, boolean fillWithRandoms, int maxFillNumber) {
        int[] numbers = new int[length];
        if (fillWithRandoms){
            Random random = new Random();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt()* maxFillNumber;

            }
        }
        return numbers;
    }

    public static int[] makeArrayOfInts(int length, boolean fillWithRandoms) {
        return makeArrayOfInts(length, fillWithRandoms, 10);
    }


    public static int[] makeArrayOfInts(int length) {
        return makeArrayOfInts(length, false, 10);
    }

    public void printAllValuesInArrayToConsole (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void printAllValuesInArrayToConsole(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public void printAllValuesInArrayToConsole (String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
//        System.out.println(Input.getString());
//        System.out.println(Input.yesNo());
        System.out.println(Input.getInt(1,5));
        System.out.println(Input.getInt());
//        System.out.println(Input.getDouble(1.1,5.5, "yee yee"));
//        System.out.println(Input.getDouble("yee ye"));
    }
}
