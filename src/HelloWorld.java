import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        int myFavoriteNumber = 3;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "I am a string";
//        System.out.println(myString);

//        myString = 'v';

//        myString = 3.14159;

//        long myNums = 0;
//        System.out.println(myNums);

//        float myNumber = (float) 3.14;
//        System.out.println(myNumber);
//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int x = 4;
//        x = x + 5;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y = y * x;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        x /= y;
//        y -= x;

//        short q = (short) Integer.MAX_VALUE;
//        System.out.printf("%d", q);

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
//        Scanner scanner = new Scanner(System.in);
//        String anotherGradeYN = "no";
//        do {
//            System.out.println("Please enter a numerical grade: ");
//            int gradeGiven = scanner.nextInt();
//            String grade = " ";
//            if (gradeGiven >= 99 && gradeGiven <= 100) {
//                grade = "A+, Nothing better!";
//            } else if (gradeGiven >= 90 && gradeGiven <= 98) {
//                grade = "A, Awesome job!";
//            } else if (gradeGiven >= 88 && gradeGiven <= 89) {
//                grade = "A-, Doing great!";
//            } else if (gradeGiven >= 87 && gradeGiven <= 88) {
//                grade = "B+, Amazing!";
//            } else if (gradeGiven >= 82 && gradeGiven <= 86) {
//                grade = "B, Wonderful!";
//            } else if (gradeGiven >= 80 && gradeGiven <= 81) {
//                grade = "B-, Great job!";
//            } else if (gradeGiven >= 78 && gradeGiven <= 79) {
//                grade = "C+, You can do better!";
//            } else if (gradeGiven >= 69 && gradeGiven <= 77) {
//                grade = "C, Passed but barely!";
//            } else if (gradeGiven >= 67 && gradeGiven <= 68) {
//                grade = "C-, These are rookie numbers bump them up!";
//            } else if (gradeGiven >= 65 && gradeGiven <= 66) {
//                grade = "D+, Obviously you should have studied!";
//            } else if (gradeGiven >= 62 && gradeGiven <= 64) {
//                grade = "D, What is going on?!?";
//            } else if (gradeGiven >= 60 && gradeGiven <= 61) {
//                grade = "D-, Terrible";
//            } else if (gradeGiven >= 0 && gradeGiven <= 59) {
//                grade = "F, Go get a job application at McDonald's!!!";
//            }
//            System.out.printf("The letter grade received was: %s \n", grade);
//            System.out.println("Would you like to enter another numerical grade? y/n");
//            anotherGradeYN = scanner.next();
//        }
//        while (anotherGradeYN.equalsIgnoreCase("y"));


//        for (int i = 1; i <= 100; i++) {
//            if (i %3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0 ){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        String choiceToContinue = "n";
//
//        do {
//            System.out.println("Please enter a numerical grade 0-100: ");
//            int gradeGiven = scanner.nextInt();
//            char grade = ' ';
//            if (gradeGiven >= 88 && gradeGiven <= 100) {
//                grade = 'A';
//            } else if (gradeGiven >= 80 && gradeGiven <= 87) {
//                grade = 'B';
//            } else if (gradeGiven >= 67 && gradeGiven <= 79) {
//                grade = 'C';
//            } else if (gradeGiven >= 60 && gradeGiven <= 66) {
//                grade = 'D';
//            } else if (gradeGiven >= 0 && gradeGiven <= 59) {
//                grade = 'F';
//            }
//            System.out.printf("Your grade is %c \n", grade);
//            System.out.println("Would you like to enter another grade: y/n");
//            choiceToContinue = scanner.next();
//
//        } while (choiceToContinue.equalsIgnoreCase("y"));

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
//        String choiceToContinue = "n";
//        do {
//            System.out.println("Please enter a numerical grade 0-100: ");
//            int gradeEntered = scanner.nextInt();
//            char grade = ' ';
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
//                System.out.printf("You received a %c \n", grade);
//                System.out.println("Would you like to enter another numerical grade? y/n");
//                choiceToContinue = scanner.next();
//            } while (choiceToContinue.equalsIgnoreCase("y"));

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

//        Scanner scanner = new Scanner(System.in);
//        String responseYN = "n";
//        do {
//            System.out.println("Please enter a numerical grade: ");
//            int response = scanner.nextInt();
//            char grade = ' ';
//            if (response >= 88 && response <= 100) {
//                grade = 'A';
//            } else
//            if (response >= 80 && response <= 87) {
//                grade = 'B';
//            } else
//            if (response >= 67 && response <= 79) {
//                grade = 'C';
//            } else
//            if (response >= 60 && response <= 66) {
//                grade = 'D';
//            } else
//            if (response >= 0 && response <= 59) {
//                grade = 'F';
//            }
//            System.out.printf("You received: %c \n", grade);
//            System.out.println("Would you like to enter another grade? y/n");
//            responseYN = scanner.next();
//
//        } while (responseYN.equalsIgnoreCase("y"));

        gradeTwo();
    }
// recursion loop
static Scanner scanner = new Scanner(System.in);
    public static void gradeTwo () {

        System.out.println("Please enter a numerical grade: ");
        int response = scanner.nextInt();
        char grade = ' ';
        if (response >= 88 && response <= 100) {
            grade = 'A';
        } else
        if (response >= 80 && response <= 87) {
            grade = 'B';
        } else
        if (response >= 67 && response <= 79) {
            grade = 'C';
        } else
        if (response >= 60 && response <= 66) {
            grade = 'D';
        } else
        if (response >= 0 && response <= 59) {
            grade = 'F';
        }
        System.out.printf("You received: %c \n", grade);
        System.out.println("Would you like to enter another grade? y/n");
        String responseYN = scanner.next();
        if (responseYN.equalsIgnoreCase("y")) {
            gradeTwo();
        }
    }
}
