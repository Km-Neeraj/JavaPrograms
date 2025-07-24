//WAP that demonstrate handling multiple types of Exceptions(e.g.,IOException,
//NullPointerException)using separate catch blocks
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx10 {
    public static void main(String[] args) {
        // Handling IOException
        try {
            FileReader r = new FileReader("myfile.txt"); // This file may not exist
            r.close();
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
        }

        // Handling NullPointerException
        try {
            String str = null;
            str.length(); // This will throw NullPointerException
        } catch (NullPointerException e1) {
            System.err.println("Null pointer exception: " + e1.getMessage());
        }

        // Handling ArithmeticException
        try {
            int res = 50 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e3) {
            System.err.println("Cannot divide by zero: " + e3.getMessage());
            e3.printStackTrace();
        }
    }
}
