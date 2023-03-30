public class DateFirstTryDemo {
    public static void main(String[] args) {

        System.out.println("Student Name: Abegunde Adebowale Nathaniel " + " Student id: 2022055741");
        System.out.println("..............................................");

        DateFirstTry date1 = new DateFirstTry();
        DateFirstTry date2 = new DateFirstTry();

        date1.month = "March";
        date1.day = 30;

        date2.makeItNewYears();


        System.out.println("date1: " + date1.yellIfNewYear());
        System.out.println("date2: " + date2.yellIfNewYear());
    }
}
