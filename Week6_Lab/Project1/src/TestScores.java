import java.util.Scanner;
public class TestScores {
    public static final int MAX_NUMBER_SCORES = 10;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double[] scores = new double[MAX_NUMBER_SCORES];
        double[] counting = new double[0];// change to just "0"
        int index; //wrong; This shouldn't be here.

        System.out.println("This program reads test scores and shows");
        System.out.println("how much each differs from the average.");
        System.out.println("Enter test scores:");

        counting = fillArray(scores);
        showDifference(scores, counting);

    }

    public static double[] fillArray(double[] scores)
    {
        System.out.println("Mark the end of the list with a negative number.");

        Scanner keyboard = new Scanner(System.in);

        for (int index = 0; index < scores.length; index++) {
            scores[0] = keyboard.nextDouble();
            if (scores[index] < 0 || scores[index] > scores.length) {
                break;
            }
            //score[i] = score;
            //i++;

        } return scores;//return i;
    }

    public static void showDifference(double[] scores, double[] counting)
    {
        double[] average = computeAverage(scores);

        System.out.println("Average of the scores = " + average);
        System.out.println("The scores are: ");

        for (int index = 0; index < scores.length; index++)
            System.out.println(scores[index] + "differs from average by " );
    }

    public static double[] computeAverage(double[] scores)
    {
        for (int index = 0; index < scores.length; index++){
            int counting = 0;
            counting++;
            scores = new double[]{(scores[index] / counting)};
        }
        return scores;
    }
}
