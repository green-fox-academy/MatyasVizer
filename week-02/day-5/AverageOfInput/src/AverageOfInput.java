import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Please enter your second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Please enter your third number:");
        double thirdNumber = scanner.nextDouble();
        System.out.println("Please enter your fourth number:");
        double fourthNumber = scanner.nextDouble();
        System.out.println("Please enter your fifth number:");
        double fifthnumber = scanner.nextDouble();

        double sumOfNumbers = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthnumber;
        double avgOfNumbers = sumOfNumbers/5;

        System.out.println("The sum of your numbers is " + sumOfNumbers + "." );
        System.out.println("The average of your numbers is " + avgOfNumbers + "." );

        // Írj egy programot, ami 5 egész számot kér be egymás után,
        // majd kiírja a számok összegét és átlagát a következő formátumban:
        //
        // Összeg: 22, Átlag: 4.4
    }
}