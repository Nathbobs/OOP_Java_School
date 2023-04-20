import java.util.Scanner;

public class GradeBook2 {
    private int numberOfStudents;
    private int numberOfQuizzes;

    private int[][] grade;

    private double[] studentAverage;
    private double[] quizAverage;

    public GradeBook2() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of Students:");
        numberOfStudents = keyboard.nextInt();

        System.out.println("Enter the number of Quizzes:");
        numberOfQuizzes = keyboard.nextInt();

        grade = new int[numberOfStudents][numberOfQuizzes];

        System.out.println("Enter quiz scores for each student:");
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfQuizzes; j++) {
                System.out.println("Enter the score for student " + grade[i] + " on quiz " + grade[j]);
                grade[i][j] = keyboard.nextInt();
            }
        }

        fillStudentAverage();
        fillQuizAverage();
    }

    private void fillStudentAverage() {
        studentAverage = new double[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            double sum = 0;
            for (int j = 0; j < numberOfQuizzes; j++) {
                sum += grade[i][j];
            }
            studentAverage[i] = sum / numberOfQuizzes;
        }
    }

    private void fillQuizAverage() {
        quizAverage = new double[numberOfQuizzes];
        for (int j = 0; j < numberOfQuizzes; j++) {
            double sum = 0;
            for (int i = 0; i < numberOfStudents; i++) {
                sum += grade[i][j];
            }
            quizAverage[j] = sum / numberOfStudents;
        }
    }

    public void display() {
        for (int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++) {
            System.out.print("Student " + studentNumber + " Quizzes: ");
            for (int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++) {
                System.out.print(grade[studentNumber-1][quizNumber-1] + " ");
            }
            System.out.println("Ave = " + studentAverage[studentNumber-1]);
        }

        System.out.println("Quiz average : ");

        for (int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++) {
            System.out.print("Quiz "+quizNumber + " Ave = "+ quizAverage[quizNumber - 1] + " ");
        }
        System.out.println();
    }
}
