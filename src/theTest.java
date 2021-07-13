import util.Input;

import java.util.Arrays;
import java.util.Random;

public class theTest {

static void randomSize () {
    Random random = new Random();
    double[] numbers = Input.makeArrayOfDoubles(random.nextInt(100), true, 100);
    double[] checkedArray = Input.makeArrayOfDoubles(numbers.length);
    System.out.println("the length of the array is; " + numbers.length);
//    Input.printAllValuesInArrayToConsole(numbers);
    do {
        int storedIndex = random.nextInt(numbers.length);
        System.out.println(numbers[storedIndex]);
        checkedArray[storedIndex]++;
    }while (!isDone(checkedArray));
    System.out.println("Done!");

    Input.printAllValuesInArrayToConsole(checkedArray);
}
public static boolean isDone(double[] toCheck) {
    for (int i = 0; i < toCheck.length; i++) {
        if (toCheck[i] == 0) {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        do {
            randomSize();
        } while (Input.yesNo("Run this program again y/n?"));
    }
}
