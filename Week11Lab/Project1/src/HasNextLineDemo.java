import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HasNextLineDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new Scanner(new FileInputStream("resource/BladeRunner.txt"));
            outputStream = new PrintWriter(new FileOutputStream("resource/NumberedRunner.txt"));
            String line;
            int i = 1;
            while (inputStream.hasNextLine()) {
                line = inputStream.nextLine();
                outputStream.println(i + " " + line);
                i++;

            }
            /* my code */

            /* Input File Location Example: resource/BladeRunner.txt */

        } catch (FileNotFoundException e) {
            System.out.println("Problem opening files.");
            System.exit(0);
        }

        inputStream.close();
        outputStream.close();
        /* my code */
    }
}


