import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
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

        int rt = 1;
        String anotherOne = "no";

        do {
            System.out.println("Please enter a number between 1 and 10: ");
            int response = scanner.nextInt();
            for (long i = 1; i <= response; i++) {
                rt *= i;
                System.out.println(i + "!" + " = " + rt);
            }
            System.out.println("Would you like to enter another number? y/n");
            anotherOne = scanner.next();
        } while (anotherOne.equalsIgnoreCase("y"));
    }
}
