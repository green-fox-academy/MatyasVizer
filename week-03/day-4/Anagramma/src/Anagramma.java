import java.util.Scanner;

public class Anagramma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first string");
        String firstString = scanner.nextLine();
        System.out.println("Please enter your second string");
        String secondString = scanner.nextLine();

        System.out.println(anagramma(firstString,secondString));


    }

    public static boolean anagramma(String szo1, String szo2) {
        String reverseofFirst = new StringBuffer(szo1).reverse().toString();
        if (reverseofFirst.equals(szo2)) {
            return true;
        } else {
                return false;
            }
        }
    }

