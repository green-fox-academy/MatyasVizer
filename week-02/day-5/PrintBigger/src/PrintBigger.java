import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your a number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter a second number");
        int secondNumber = scanner.nextInt();

        if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is bigger");
        }
        else
            System.out.println(firstNumber + " is bigger");
        // Írj egy programot, ami két számot kér a standard input-ból
        // és kiírja a nagyobbat
    }
}