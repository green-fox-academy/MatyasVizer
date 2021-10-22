import java.util.Scanner;

public class AnimalAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the number of your hens:");
        int numberOfHens = scanner.nextInt();

        System.out.println("Please enter the number of your swines:");
        int numberOfSwines= scanner.nextInt();


        int legsOfHens = numberOfHens*2;
        int legsOfSwines = numberOfSwines*4;

        int sumOfLegs = legsOfHens + legsOfSwines;

        System.out.println("There are " + sumOfLegs + " legs in total.");
        // Írj egy programot, ami két egész számot kér
        // Az első a farmer tyúkjainak számát reprezentálja
        // A második a farmer sertéseinek számát reprezentálja
        // Írja ki, hogy összesen hány darab lába van az állatoknak a farmon
    }
}