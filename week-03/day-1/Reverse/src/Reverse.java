import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int [] numbers = {4, 5, 6, 7};

        int i = 0;
        for (i = 0; i < numbers.length/2; i++) {
            int temp = numbers [i];
            numbers [i] = numbers [numbers.length-i-1];
            numbers [numbers.length-i-1] = temp;

        }

        System.out.println(Arrays.toString(numbers));
    }
}
