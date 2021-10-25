import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of girls");
        int numberOfGirls = scanner.nextInt();
        System.out.println("Please enter the number of boys");
        int numberOfBoys = scanner.nextInt();

        if (numberOfBoys + numberOfGirls > 20 && numberOfBoys == numberOfGirls) {
            System.out.println("This party is awesome!");
        }

        else if ( numberOfBoys + numberOfGirls > 20 && numberOfBoys !=numberOfGirls && numberOfGirls > 0) {
            System.out.println("This party is quite good!");
        }

        else if (numberOfBoys + numberOfGirls < 20 && numberOfGirls > 1) {
            System.out.println("Average party...");
        }

        else if (numberOfBoys + numberOfGirls < 20 && numberOfGirls == 0){
            System.out.println("Sausage Party :/");
        }

        if (numberOfBoys + numberOfGirls > 20 && numberOfGirls == 0) {
            System.out.println("Sausage Party :/");
        }
        // Írj egy programot, ami két számot kér a standard input-ból
        // Az első szám a lányok száma, akik jönnek a buliba
        // A második szám a fiúk száma
        //
        // Ha több, mint 20 ember eljön és a lányok és fiúk száma egyenlő
        // Írja ki, hogy: Ez a buli kitűnő!
        //
        // Ha több, mint 20 ember eljön, de a lányok - fiúk arány nem egyenlő
        // Írja ki, hogy: Ez a buli egész jó!
        //
        // Ha kevesebb, mint 20 ember jön el
        // Írja ki, hogy: Átlagos buli...
        //
        // Ha egy lány sem jön el, függetlenül az emberek számától
        // Írja ki, hogy: Virsli party
    }
}