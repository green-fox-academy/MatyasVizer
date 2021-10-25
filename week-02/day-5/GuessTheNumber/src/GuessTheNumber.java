import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        {
            int min = 0;
            int max = 100;
            int b = (int) (Math.random() * (max - min + 1) + min);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Guess the number(it is between 0 and 100");
            int userGuess = scanner.nextInt();

            boolean found = false;
            while (!found) {
                if (userGuess == b) {
                    System.out.println("Correct!");
                    break;
                } else if (userGuess > b) {
                    System.out.println("Too big");
                    userGuess = scanner.nextInt();
                } else if (userGuess < b) {
                    System.out.println("Too small");
                    userGuess = scanner.nextInt();
                }

            }
        }
    }


}

