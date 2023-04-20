import java.util.Scanner;

public class TestScores3 {
    public class TestScores2 {
        public static final int MAX_NUMBER_SCORES = 10;

        public static void main(String[] args) {
            double[] scores = new double[MAX_NUMBER_SCORES];
            int counting = 0;

            System.out.println("This program reads test scores and shows");
            System.out.println("how much each differs from the average.");
            System.out.println("Enter test scores:");

            counting = fillArray(scores);
            showDifference(scores, counting);

        }

        public static int fillArray(double[] scores) {
            System.out.println("Mark the end of the list with a negative number.");
            Scanner input = new Scanner(System.in);
            int count = 0;
            for (int i = 0; i < MAX_NUMBER_SCORES; i++) {
                double score = input.nextDouble();
                if (score < 0) {
                    break;
                }
                scores[i] = score;
                count++;
            }
            return count;
        }

        public static void showDifference(double[] scores, int count) {
            double average = computeAverage(scores, count);

            System.out.println("Average of the scores = " + average);
            System.out.println("The scores are: ");
            for (int i = 0; i < count; i++) {
                System.out.println("Score #" + (i+1) + ": " + scores[i] + " differs from average by " + (scores[i] - average));
            }
        }

        public static double computeAverage(double[] scores, int count) {
            double sum = 0;
            for (int i = 0; i < count; i++) {
                sum += scores[i];
            }
            return sum / count;
        }
    }
}
