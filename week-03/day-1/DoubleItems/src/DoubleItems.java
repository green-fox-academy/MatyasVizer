import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};

        for (int i= 0; i <= numList.length - 1; i++) {
            numList [i] = numList [i] + numList[i];
        }
        System.out.println(Arrays.toString(numList));
    }
}
