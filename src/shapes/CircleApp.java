package shapes;

import util.Input;

import java.util.Arrays;
import java.util.Collections;


public class CircleApp {
    private static final int count = 0;


    public static void main(String[] args) {
//        do {
//            Circle circle = new Circle(Input.getDouble(1,10));
//            System.out.printf("Circumference of the damn circle is: %.02f\n", circle.getCircumference());
//            count++;
//        } while (Input.yesNo());
//        System.out.println(count);
//        count = 0;

        double[] myDubs = {1.2,2.3,3.4,4.5,5.6};

        for (double myDub : myDubs) {
            System.out.println(myDub);
        }

        String[] buck = new String[100];
        Arrays.fill(buck, "buck");
        for (String b : buck) {
            System.out.println(b);

        }

        String[] buck2 = new String[100];
        Arrays.fill(buck2, "buck");
        System.out.println(Arrays.equals(buck, buck2));
        buck2[99] = "No, really buck";
        for (String b : buck2) {
            System.out.println(b);
        }

        System.out.println(Arrays.equals(buck, buck2));

        String[] buck3 = Arrays.copyOf(buck2, 100);
        buck3[98] = "Hello";
        for (String b : buck3) {
            System.out.println(b);
        }
        System.out.println(Arrays.equals(buck2, buck3));
        System.out.println(Arrays.equals(buck, buck3));

//        String myArrayAsString = Arrays.toString(buck3);
//        System.out.println(myArrayAsString);
        System.out.println(Arrays.toString(buck3));

        buck3[9] = "Apple";
        System.out.println(Arrays.toString(buck3));
        Arrays.sort(buck3);
        System.out.println(Arrays.toString(buck3));
        Arrays.sort(buck3, Collections.reverseOrder());
        System.out.println(Arrays.toString(buck3));
    }
}
