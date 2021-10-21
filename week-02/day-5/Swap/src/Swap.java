public class Swap {
    public static void main(String[] args) {
        int a = 123;

        int b = 526;

        int x = 0;

        x = a;
        a = b;
        b = x;

        System.out.println("Value of 'a' after swap: " + a);
        System.out.println("Value of 'b' after swap: " + b);
    }
}