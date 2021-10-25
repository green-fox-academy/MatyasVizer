import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter a number:");
        number = scanner.nextInt();
        System.out.println("Printing multiplication table...");
        for( int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + number + " = " + i * number );
        }

    }
}
