public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // Növeld meg az "a" változó értékét 10-zel
        a += 10;
        System.out.println(a);

        int b = 100;
        // Csökkentsd a "b" változó értékeét 7-tel
        b -= 7;
        System.out.println(b);

        int c = 44;
        // A c értéke legyen dupla akkora
        c *= 2;
        System.out.println(c);

        int d = 125;
        // Oszd el a d-t 5-tel
        d /= 5;
        System.out.println(d);

        int e = 8;
        // Emeld köbre az e változó értékét
        e = e*e*e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // Logikai (boolean) értékként írasd ki hogy f1 nagyobb-e f2-nél
        if (f1 > f2)
            System.out.println("f1 is bigger than f2");
            else
            System.out.println("f2 is bigger than f1");
        int g1 = 350;
        int g2 = 200;
        // Mondja meg a program, hogy g2 duplája nagyobb-e g1-nél (boolean)
        if ((g2*2)> g1)
            System.out.println("g2 is bigger than g1");
        else
            System.out.println("g2 is smaller than g1");

        int h = 135798745;
        // Mondja meg a program, hogy osztható-e 11-el maradék nélkül?
        // Írasd is ki logikai (boolean) értékként
        if (h % 2 > 0)
            System.out.println("h is an even number: false");
            else
            System.out.println("h is an even number: true");

        int i1 = 10;
        int i2 = 3;
        // Mondja meg a program hogy i1 nagyobb-e i2 négyzeténél ÉS ugyanakkor kisebb-e i2 köbénél (boolean)
        if (i1 > (i2*i2))
            System.out.println("i1 is bigger than the square of i2 ");
            else
            System.out.println("i1 is smaller than the square of i2 ");

        if (i1 < (i2*i2*i2))
            System.out.println("and smaller than the cube of i2");
            else System.out.print("and bigger than the cube of i2");


        int j = 1521;
        // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)
        if (j % 3 < 0)
            System.out.println("j can be divided by 3");
        else
            System.out.println("j can not be divided by 3");
        if (j % 5 <0 && j % 3 < 0)
            System.out.println("j can be divided by 3 and 5");
        else
            System.out.println("j can not be divided by 3 and 5");
        if (j % 5 < 0)
            System.out.println("j can be divided by 5");
        else
            System.out.println("j can not be divided by 5");
    }
}