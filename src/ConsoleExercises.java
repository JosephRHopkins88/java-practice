import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.\n", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number please: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: \"" + userInput + "\"");

//        System.out.print("Please enter three words: ");
//        String userInput = scanner.next();
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        scanner.next();
//        String userInput4 = scanner.next();
//
//        System.out.printf("Your three words are: %s, %s, %s, %s", userInput, userInput1, userInput2, userInput4);
//        /*scanner.useDelimiter("\n");*/
//        System.out.print("Please enter a sentence: ");
//        String userInput = scanner.next();
//        System.out.printf("Sentence is: %s", userInput);


        System.out.println("Please enter a length: ");
        double length = scanner.nextDouble();
        System.out.println("Please enter a width: ");
        double width = scanner.nextDouble();
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        System.out.printf("The area of the room is : %s. The perimeter of the room is : %s.", area, perimeter);
    }
}
