
package Lecture16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamsCopyFiles {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String inputFile="src/Lecture16/files/china.gif";
        String outputFile ="src/Lecture16/files/china1.gif";
        try (
            InputStream  inputStream  = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time in milliseconds: " + 
                (endTime - startTime));
    }
}
