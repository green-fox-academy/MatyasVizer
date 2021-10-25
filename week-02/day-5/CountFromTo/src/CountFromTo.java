import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int numberOne = scanner.nextInt();
        System.out.println("Please enter another number");
        int numberTwo = scanner.nextInt();

        if (numberOne > numberTwo) {
            System.out.println("The second number should be bigger than the first one");
        }

        else {
            for( int i = numberOne; i < numberTwo; i++) {
                System.out.println(i);
            }
        }
    }
}
