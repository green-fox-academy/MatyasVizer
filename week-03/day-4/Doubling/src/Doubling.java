public class Doubling {
    public static void main(String[] args) {
        int baseNum = 123;
        baseNum = doubling(baseNum);
        System.out.println(baseNum);
    }
    static int doubling(int input) {
        input = input*2;
        return input;

    }
}
