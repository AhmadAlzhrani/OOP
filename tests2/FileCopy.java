package Lecture16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileCopy {
    public static void main(String[] args) throws IOException {
    String sourceFileName="src/Lecture16/files/china.gif";
    String distFileName ="src/Lecture16/files/china2.gif";
    // Check if source file exists
    File sourceFile = new File(sourceFileName);
    if (!sourceFile.exists()) {
      System.out.println("Source file " + sourceFileName + " does not exist");
      System.exit(2);
    }
    // Check if target file exists
    File targetFile = new File(distFileName);
    if (targetFile.exists()) {
      System.out.println("Target file " + distFileName + " already exists");
      //System.exit(3);
    }
    try (
      // Create input and output files
      Scanner input = new Scanner(sourceFile);
      PrintWriter output = new PrintWriter(targetFile);
    ) {        
      while (input.hasNext()) {
        String s1 = input.nextLine();
        output.println(s1);
      }
    }
   
  
    }
}