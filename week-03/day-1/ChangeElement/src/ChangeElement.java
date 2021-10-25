import java.util.Arrays;

public class ChangeElement {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 8, 5, 6};
        int indexOfEight = Arrays.asList(numbers).indexOf(8);
        numbers [indexOfEight] = 4;
        System.out.println(numbers[indexOfEight]);
    }
}
