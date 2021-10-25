import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter a number...");
        int lineCount = scanner.nextInt();

        int i, j;
        for (i = 1; i <= lineCount; i ++)
        {
            for (j = 1; j <= lineCount; j++) {
                if((i + j) % 2 !=0)
                    System.out.print(" ");
                else
                    System.out.print("% ");
            }
            System.out.println("");
        }
    }
}
