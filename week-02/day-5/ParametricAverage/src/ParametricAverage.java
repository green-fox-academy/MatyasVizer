import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ParametricAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter a number to start...");
        int startNumber = scanner.nextInt();
        int sumOfNumbers = 0;
        sumOfNumbers = sumOfNumbers + startNumber;

        int i = 0;
        while (i < startNumber) {
            System.out.println("Please enter another number " + (startNumber - i ) + " remaining.");
            int tempNumberContainer = scanner.nextInt();
            sumOfNumbers = sumOfNumbers + tempNumberContainer;
            i++;
        }
        System.out.println();

        int averageOfSum = sumOfNumbers / (startNumber + 1);
        System.out.println("Total: " + sumOfNumbers);
        System.out.println("Average: " + averageOfSum);
    }
}
