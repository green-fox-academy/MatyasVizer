import java.util.function.IntToDoubleFunction;

public class TwoNumbers {
    public static void main(String[] args) {
        Integer a = 13;
        Double b = 22.0;
        // Írasd ki 13 és 22 összegét
        System.out.println(a+b);
        // Írasd ki 13 és 22 különbségét
        System.out.println(a-b);
        // Írasd ki 13 és 22 szorzatát
        System.out.println(a*b);
        // Írasd ki 22-őt osztva 13-mal művelet eredményét (törtszám)
        System.out.println(b/a);
        // Írasd ki egész számként a 22 osztva 13-mal művelet eredményét
        System.out.println(Math.floor(b/a));
        // Írasd ki 22-őt osztva 13-mal művelet osztási maradékát.
        System.out.println(b%a);
    }
}
