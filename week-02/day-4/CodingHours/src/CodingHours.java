public class CodingHours {
    public static void main(String[] args) {

        Integer studentCodingHours = 6;
        Double semesterDuration = 17.0;
        Integer weeklyWorkdays = 5;
        Integer averageWorkhoursWeekly = 52;

        Double semesterCodingHours = (studentCodingHours*semesterDuration*weeklyWorkdays);
        Double percentageOfCoding = (semesterCodingHours/(averageWorkhoursWeekly*semesterDuration)*100);

        System.out.println(semesterCodingHours);

        System.out.printf("%.2f", percentageOfCoding);
        System.out.println(" %");

    }
}
