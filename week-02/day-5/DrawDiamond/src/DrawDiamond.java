import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int lineCount = scanner.nextInt();
        int i, j, k;
        for( i = 0; i <= lineCount; i++)
        {
            for(j = lineCount; j > i; j--)
            {
                System.out.print("  ");
            }
            for(k=1;k<(i*2);k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for( i = lineCount-1; i >= 1; i--)
        {
            for(j = lineCount; j > i; j--)
            {
                System.out.print("  ");
            }
            for(k=1;k<(i*2);k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


