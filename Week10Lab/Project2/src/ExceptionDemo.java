import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputNum;
        while(true) {
            try {
                inputNum = keyboard.nextInt();

                if(inputNum == 808)
                    break;

                exerciseMethod(inputNum);
            } catch (PositiveNumberException e) {
                System.out.println(/* your code */);
                System.out.println(/* your code */);
            }
        }
        System.out.println(/* your code */);
    }

    public static void exerciseMethod(int number) throws PositiveNumberException {
        try {
            if (number > 0)
            /* your code */
			else if (number < 0)
            /* your code */
			else
            /* your code */
        } catch (NegativeNumberException e) {
            System.out.println(/* your code */);
            System.out.println(/* your code */);
        } finally {
            System.out.println(/* your code */);
        }
        System.out.println(/* your code */);
    }
}
