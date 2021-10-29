public class Greet {
    public static void main(String[] args) {
        String gfa = "Green Fox";
        greet(gfa);
    }

    public static void greet(String name){
        String nameFinal = "Üdv, kedves " + name;
        System.out.println(nameFinal);
    }
}

