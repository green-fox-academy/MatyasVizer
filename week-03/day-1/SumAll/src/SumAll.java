public class SumAll {
    public static void main(String[] args) {

        int [] numbers = {3, 4, 5, 6, 7};
        int sumOfAll = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumOfAll += numbers[i];
        }
        System.out.println(sumOfAll);
    }
}
