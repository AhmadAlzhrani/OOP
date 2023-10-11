
package Lecture16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamsCopyFilesOnes {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String inputFile="src/week09/files/temp.txt";
        String outputFile ="src/week09/files/temp1.txt";
        try (
            InputStream  inputStream  = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
            int fileSize = (int) new File(inputFile).length();
            byte[] allBytes = new byte[ fileSize];
            inputStream.read(allBytes);
            outputStream.write(allBytes);
        
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time in milliseconds: " + 
                (endTime - startTime));
    }
}
