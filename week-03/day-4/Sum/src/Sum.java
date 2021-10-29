import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int addUntilVal = scanner.nextInt();

        int sumOfAll = 0;

        sumOfAll = sum(addUntilVal);

        System.out.println(sumOfAll);

    }

    public static int sum(int szam) {
        int osszeg = 0;
        for (int i = 0; i < szam; i++) {
            osszeg = osszeg + i;
        }
        return osszeg;
    }
}
