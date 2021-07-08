import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//
//       for (int i=5; i<=15; i++)
//       {
//           System.out.println(i);
//        }
//
//
//       for (long i =2; i<=1000000; i*=i) {
//           System.out.println(i);
//       }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Please enter a number: ");
//        int userInput = scanner.nextInt();
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i<=userInput; i++) {
//            System.out.printf("%-7s| %-8s| %-5s\n", i, i*i, i*i*i);
//        }



        String continueYN = "n";

        do {
            System.out.println("gimme a grade");
            int userInput = scanner.nextInt();
            char grade =' ';
            if (userInput >= 88 && userInput <=100) {
                grade = 'A';
            }else if (userInput >= 80 && userInput <=87) {
                grade = 'B';
            }else if (userInput >= 67 && userInput <=79) {
                grade = 'C';
            }else if (userInput >= 60 && userInput <=66) {
                grade = 'D';
            }else if (userInput >= 0 && userInput <=59) {
                grade = 'F';
            }
            System.out.printf("Your grade is %c\n", grade);
            System.out.println("Would you like to continue y/n?");
            continueYN = scanner.next();

        } while (continueYN.equalsIgnoreCase("y"));
    }
}
