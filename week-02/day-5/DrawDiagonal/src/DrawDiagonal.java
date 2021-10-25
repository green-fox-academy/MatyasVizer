import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number of rows");
            int lineCount = scanner.nextInt();

            for (int i = 0; i < lineCount; i++ )
            {
                for (int j = 0 ; j < lineCount; j++ )
                {
                    if (i == 0 || i == lineCount - 1 || j == 0 || j == lineCount - 1 || j == i) {
                        System.out.print("%");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }
}





