
import java.util.Scanner;
public class Arrays1 {
    /**
     * Reads in 5 scores and shows us how much each score differs from the highest score.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double[] score = new double[5];
        int index;
        double max;

        System.out.println("Enter " + score.length + " scores:");
        score[0] = keyboard.nextDouble();
        max = score[0];
        for (index = 1; index < score.length; index++) {
            score[index] = keyboard.nextDouble();
            if (score[index] > max)
                max = score[index];
            //max is the largest of the values score[0]
        }
        System.out.println("The highest score is " + max);
        System.out.println("The scores are: ");
        for (index = 0; index < score.length; index++) {
            System.out.println(score[index] + " differs from max by " + (max - score[index]));
        }

    }

}
