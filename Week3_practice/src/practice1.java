import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double netINcome, tax;
        System.out.print("Input your net annual income: ");
        netINcome = keyboard.nextDouble();
        System.out.println("Your net income is $" + netINcome);
    }

}
