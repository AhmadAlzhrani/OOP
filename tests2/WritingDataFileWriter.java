package Lecture16;

import java.io.File;
import java.io.FileWriter;

public class WritingDataFileWriter {
    
  public static void main(String[] args) throws java.io.IOException {
    File file = new File("src/Lecture16/files/scores.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      //System.exit(0);
    }
    
 
      try (FileWriter  output = new FileWriter (file)) {
          // Write formatted output to the file
          output.write("John T Smith ");
          output.write(90+"\n");
          output.write("Eric K Jones ");
          output.write(85+"\n");
          // Close the file
      }
  }
}

