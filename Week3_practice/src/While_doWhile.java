public class While_doWhile {
    public static void main(String[] args) {
        System.out.println("First while loop:");
        int countDown = 3;
        while (countDown > 0){
            System.out.println("Hello");
            countDown -= 1;
        }
        System.out.println("Second While loop");
        countDown = 0;
        while(countDown > 0){
            System.out.println("Hello");
            countDown -= 1;
        }
        System.out.println("FIrst do while loop");
        countDown = 3;
        do {
            System.out.println("Hello");
            countDown -= 1;

        }while(countDown > 0);

        System.out.println("Second do-while loop");
        countDown = 0;
        do {
            System.out.println("Hello");
            countDown -= 1;
        }while (countDown > 0 );
    }
}
