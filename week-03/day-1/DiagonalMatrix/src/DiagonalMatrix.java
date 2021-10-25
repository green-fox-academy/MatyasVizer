import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please define the length of the matrix:");
        int lengthOfMatrix = scanner.nextInt();




        int[][] matrix = new int [lengthOfMatrix][lengthOfMatrix];

        int i;
        int j = 0;


        for (i = 0; i < 1; i++) {
                for (j = 0; j < lengthOfMatrix; j++) {
                    matrix[i][j] = 1;
                    System.out.println(Arrays.toString(matrix [j]));
                }
                System.out.println("");




        }

    }
}
