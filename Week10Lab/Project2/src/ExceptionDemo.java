import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputNum;
        System.out.println("Name: Nathaniel Abegunde 		Student Number: 2022055741");
        System.out.println("----------------------------------------------------" );
        while(true) {
            try {
                inputNum = keyboard.nextInt();

                if(inputNum == 808)
                    break;

                exerciseMethod(inputNum);
            } catch (PositiveNumberException e) {
                //System.out.println("In finally block"/* my code */);
                System.out.println("Exception is caught in main"/* my code */);
            }
        }
        System.out.println("End of loop"/* my code */);
    }

    public static void exerciseMethod(int number) throws PositiveNumberException {
        try {
            if (number > 0){
                throw new PositiveNumberException();
                /* my code */
            }

			else if (number < 0){
                throw new NegativeNumberException();
                /* my code */
            }
			else
                System.out.println("No Exception"/* my code */);
        } catch (NegativeNumberException e) {
            System.out.println("This number cannot be accepted"/* my code */);
            System.out.println("Exception is caught in exerciseMethod"/* my code */);
        } finally {
            System.out.println("In finally block"/* my code */);
        }
        System.out.println("After finally block"/* my code */);
    }
}
