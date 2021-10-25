import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number:");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 < 0)
            System.out.println("The entered number is even.");
        else
            System.out.println("The entered number is odd.");
    }
}
