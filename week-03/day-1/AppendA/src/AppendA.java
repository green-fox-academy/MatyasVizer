import java.util.Arrays;

public class AppendA {
    public static void main(String[] args) {
        String [] animals = {"koal", "pand", "zebr"};

        for(int i = 0; i < animals.length; i++) {
            String temp = animals[i] + "a";
            animals [i] = temp;
        }
        System.out.println(Arrays.toString(animals));
    }
}
