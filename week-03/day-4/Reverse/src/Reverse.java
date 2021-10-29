public class Reverse {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(reverse(toBeReversed));
    }
    public static String reverse (String input) {
        char ch;
        String revString = "";
        for (int i = 1; i < input.length(); i++) {
            ch = input.charAt(i);
            revString = ch + revString;
            input = revString;
        }
    return input;
    }
}