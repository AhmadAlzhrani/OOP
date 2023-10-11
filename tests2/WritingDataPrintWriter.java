package Lecture16;

import java.io.File;
import java.io.PrintWriter;

public class WritingDataPrintWriter {
    
  public static void main(String[] args) throws java.io.IOException {
    File file = new File("src/Lecture16/files/scores.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }
    
 
    PrintWriter output = new PrintWriter(file);
    // Write formatted output to the file
    output.print("John T Smith ");
    output.println(90);
    output.print("Eric K Jones ");
    output.println(85);
    output.close();
      
  }
}

