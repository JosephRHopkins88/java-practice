import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        diceRoll(5,9,300);
//        System.out.println(addition(1,2));
//        System.out.println(subtraction(2,1));
//        System.out.println(multiplication(5,5));
//        System.out.println(division(10,5));
//        System.out.println(modulus(3,2));
//        System.out.println(mulLoop(5,5));
//        System.out.println(mulCur(5,5));
//
//        System.out.println("Enter a number between 1 and 10: ");
//        int numberChose = getInteger(1, 10);
//
//    }
//
//    public static double addition (double num1, double num2) {
//        return num1 + num2;
//    } public static double subtraction (double num1, double num2) {
//        return num1 - num2;
//    } public static double multiplication (double num1, double num2) {
//        return num1 * num2;
//    } public static double division (double num1, double num2) {
//        return num1 / num2;
//    } public static double modulus (double num1, double num2) {
//            return num1 % num2;
//    } public static double mulLoop (double num1, double num2) {
//        double runningTotal = 0;
//        for (int i = 1; i <=num2; i++) {
//            runningTotal+=num1;
//        }
//        return runningTotal;
//    }
//
//    static double rt =0;
//    public static double mulCur (double num1, double num2) {
//
//if(num2>0)
//{
//    rt += num1;
//    num2--;
//    mulCur(num1,num2);
//}
//
//
//return rt;
//    }
//
//
//
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//       int chosen = scanner.nextInt();
//       if (chosen >= min && chosen <= max) {
//           return chosen;
//       } else {
//           System.out.println("It is supposed to be between " + min + " and " + max + ". Try again.");
//           getInteger(min, max);
//       }
//       return chosen;

        Scanner scanner = new Scanner(System.in);

//        int rt = 1;
//        String anotherOne = "no";
//
//        do {
//            System.out.println("Please enter a number between 1 and 10: ");
//            int response = scanner.nextInt();
//            for (long i = 1; i <= response; i++) {
//                rt *= i;
//                System.out.println(i + "!" + " = " + rt);
//            }
//            System.out.println("Would you like to enter another number? y/n");
//            anotherOne = scanner.next();
//        } while (anotherOne.equalsIgnoreCase("y"));

//        System.out.println("Please enter the number of sides for a pair of dice.");
//        int userDice = scanner.nextInt();

//        for (int i = 0; i <= 100; i++) {
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
//
//
//        String continueGrades = "n";
//        do {
//            System.out.println("Please enter a numerical grade: ");
//            int gradeEntered = scanner.nextInt();
//            char grade = ' ';
//
//
//            if (gradeEntered >= 88 && gradeEntered <= 100) {
//                grade = 'A';
//            } else if (gradeEntered >= 80 && gradeEntered <= 87) {
//                grade = 'B';
//            } else if (gradeEntered >= 67 && gradeEntered <= 79) {
//                grade = 'C';
//            } else if (gradeEntered >= 60 && gradeEntered <= 66) {
//                grade = 'D';
//            } else if (gradeEntered >= 0 && gradeEntered <= 59) {
//                grade = 'F';
//            }
//            System.out.println(grade);
//            System.out.println("Would you like to continue? y/n");
//            continueGrades = scanner.next();
//
//        } while (continueGrades.equalsIgnoreCase("y"));

    }
        public static void diceRoll (int min, int max, int numRolls) {
            for (int i = 0; i < numRolls; i++) {
                int a = (int)((Math.random() + .01) * (max-min)) + min;
                if (a == 9) {
                System.out.println(a);
            }}
        }
    }

