public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 23;
        int currentMinutes = 59;
        int currentSeconds = 0;

        // Írj egy programot, ami kiszámítja, hogy hány másodperc
        // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        // lehet beállítani (a végeredmény is legyen egész szám)
        int timeRemainingHours = 23 - currentHours ;
        int timeRemainingMinutes = 59 - currentMinutes;
        int timeRemainingSeconds = 60 - currentSeconds;

        int cumulatedSecondsRemaining = (timeRemainingHours*3600)+(timeRemainingMinutes*60)+(timeRemainingSeconds);
        System.out.println(cumulatedSecondsRemaining + " second(s) left from the day.");
    }
}