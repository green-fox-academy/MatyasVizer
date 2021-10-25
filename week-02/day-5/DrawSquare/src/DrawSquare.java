import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            int lineCount = scanner.nextInt();

            for (int i = 0; i < lineCount; i++ )
            {
                for (int j = 0 ; j < lineCount; j++ )
                {
                    if (i == 0 || i == lineCount - 1 || j == 0 || j == lineCount - 1) {
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




