public class BMI {
    public static void main(String[] args) {

        double massInKg = 108;
        double heightInMeter = 1.91;

        double BMI = (massInKg/(heightInMeter*heightInMeter));

        System.out.println( "This is my BMI: " + BMI);
    }
}
