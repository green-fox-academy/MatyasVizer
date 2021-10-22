import sun.java2d.Surface;

public class Cuboid {
    public static void main(String[] args) {
        // Írj egy programot, ami egy téglatest 3 oldalát tartalmazza változókban (doubles)
        // A program írja ki a felületét és térfogatát a testnek ilyen formátumban:
        Integer width = 14;
        Integer height = 53;
        Integer length = 67;
        // Felület: 600
        // Térfogat: 1000
        Integer Surface = ((width*height*2)+(length*height*2)+(width*length*2));
        Integer Volume = (width*length*height);
        System.out.println("Surface: " + Surface);
        System.out.println("Volume: " + Volume );
    }
}