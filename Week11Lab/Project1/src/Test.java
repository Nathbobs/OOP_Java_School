public class Test {
}

//package selfTest;
//
//        import java.io.FileInputStream;
//        import java.io.FileNotFoundException;
//        import java.io.FileOutputStream;
//        import java.io.PrintWriter;
//        import java.util.Scanner;
//
//public class HasNextLineDemo {
//
//    public static void main(String[] args) {
//        Scanner inputStream = null;
//        PrintWriter outputStream = null;
//
//        try {
//            // Create input stream from BladeRunner.txt
//            inputStream = new Scanner(new FileInputStream("BladeRunner.txt"));
//            // Create output stream to NumberedRunner.txt
//            outputStream = new PrintWriter(new FileOutputStream("NumberedRunner.txt"));
//
//            // Initialize line number to 1
//            int lineNumber = 1;
//
//            // Iterate through each line in the input stream
//            while (inputStream.hasNextLine()) {
//                // Get the current line
//                String line = inputStream.nextLine();
//                // Write the line number and line content to the output stream
//                outputStream.println(lineNumber + ": " + line);
//                // Increment the line number
//                lineNumber++;
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Problem opening files.");
//            System.exit(0);
//        } finally {
//            // Close the input and output streams to deallocate resources
//            if (inputStream != null) {
//                inputStream.close();
//            }
//            if (outputStream != null) {
//                outputStream.close();
//            }
//        }
//    }
//}

