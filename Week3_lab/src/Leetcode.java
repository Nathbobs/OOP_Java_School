import java.util.Scanner;
public class Leetcode {
    public static void main(String[] args) {
        kItemsWithMaximumSum(3,5,0,0);
    }
    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum1 = numOnes + numZeros;
        int sum2 = numOnes + numNegOnes;
        int sum3 = numNegOnes + numZeros;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input numOnes: ");
        numOnes = keyboard.nextInt();
        System.out.println("Input numZeros: ");
        numZeros = keyboard.nextInt();
        System.out.println("Input numNegOnes: ");
        numNegOnes = keyboard.nextInt();

        k = 0;
        if (sum1 > sum2 && sum1 > sum3){
            k = sum1;
        }
        else if (sum2 > sum1 && sum2 > sum3){
            k = sum2;
        }
        else if
        (sum3 > sum1 && sum3 > sum2){
            k = sum3;
        };
        return k;

    }
}
