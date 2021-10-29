import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorUntil = scanner.nextInt();

        int factorSumVal = factorio(factorUntil);
        System.out.println(factorio(factorUntil));
    }
    public static int factorio(int szam) {
        int osszeg = 1;
        for (int i = 1; i <= szam; i++) {
            osszeg = osszeg*i;
        }
    return osszeg;
    }


}
