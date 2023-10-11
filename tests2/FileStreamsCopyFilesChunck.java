package Lecture16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileStreamsCopyFilesChunck {
 public static void main(String[] args) {
        final int BUFFER_SIZE = 4096; // 4KB
        long startTime = System.currentTimeMillis();
        String inputFile="src/week09/files/temp.txt";
        String outputFile ="src/week09/files/temp1.txt";
        try (
            InputStream  inputStream  = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
            
            byte[] buffer = new byte[BUFFER_SIZE];
            while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time in milliseconds: " + 
                (endTime - startTime));
    }
}
