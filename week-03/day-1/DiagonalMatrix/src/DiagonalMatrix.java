import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please define the length of the matrix:");
        int lengthOfMatrix = scanner.nextInt();

        int[][] matrix = new int[lengthOfMatrix][lengthOfMatrix];

        for (int i = 0; i < lengthOfMatrix; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (j == i) {
                    matrix[i][j] = 1;
                }
                else {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < lengthOfMatrix; i++) {
            for (int j = 0; j < lengthOfMatrix; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

}

