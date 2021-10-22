import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a distance in miles:");
        double distanceInMiles = scanner.nextDouble();

        double distanceInKilometres = (distanceInMiles*1.609344);

        System.out.println("The distance you entered in miles, is when converted; " + distanceInKilometres + " kilometres");
    }
}