package Lecture16;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStreams {
    public static void main(String[] args) throws IOException {
        String fileName="src/Lecture16/files/testfilestream.txt";
    
        try ( FileOutputStream output = new FileOutputStream(fileName);) {
          // Output values to the file
          for (int i = 250; i <= 260; i++)
            output.write(i);
          byte[] a = {'A','H'};
          output.write(a, 0, a.length);
          String a1 = "AB";
          output.write(a1.getBytes());
        }
        File sourceFile = new File(fileName);
        try (FileInputStream input = new FileInputStream(sourceFile); ) {
          // Read values from the file
          int value;
          while ((value = input.read()) != -1)
            System.out.print( value + " ");
    }
  }
}