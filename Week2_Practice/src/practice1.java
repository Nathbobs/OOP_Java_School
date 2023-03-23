public class practice1 {
    public static void main(String[] args) {
        double price = 19.8;
        System.out.print("$");
        System.out.printf("%6.2f", price); // this is to declare padded spaces on the sides of the characters
        System.out.println(" each");

        double value = 12.123;
        System.out.printf("Start%8.2fEnd", value); // this will give padded spaces on both right and left of the characters
        System.out.println();
        System.out.printf("Start%-8.2fEnd", value);
        System.out.println();
    }
}
