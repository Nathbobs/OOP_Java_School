import java.util.Scanner;

public class GradeBook1 {
    private int numberOfStudents;
    private int numberOfQuizzes;

    private int [][] grade;

    private double[] studentAverage;
    private double[] quizAverage;

    public GradeBook1()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of Students:");
        numberOfStudents = keyboard.nextInt();

        System.out.println("Enter the number of Quizzes:");
        numberOfQuizzes = keyboard.nextInt();


        /* Take inputs from the keyboard and store the score in grade (using nested for-loops) */

        fillStudentAverage();
        fillQuizAverage();
    }



    private void fillStudentAverage()
    {
        /* Write the code */
    }

    private void fillQuizAverage()
    {
        /* Write the code */
    }


    public void display()
    {
        for(int studentNumber =1; studentNumber <= numberOfStudents; studentNumber++)
        {
            System.out.print("Student " + studentNumber + " Quizzes: ");
            for(int quizNumber = 1;quizNumber <= numberOfQuizzes; quizNumber++)
                System.out.print(grade[studentNumber-1][quizNumber-1] + " ");
            System.out.println("Ave = " + studentAverage[studentNumber-1]);
        }

        System.out.println("Quiz average : ");

        for(int quizNumber = 1; quizNumber <= numberOfQuizzes;quizNumber++)
            System.out.print("Quiz "+quizNumber + " Ave = "+ quizAverage[quizNumber - 1] + " ");
        System.out.println();
    }


}
