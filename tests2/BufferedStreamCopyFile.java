package Lecture16;
import java.io.*;

public class BufferedStreamCopyFile {

  public static void main(String[] args) throws IOException { 
    final int BUFFER_SIZE = 4096; // 4KB
    File sourceFile = new File("src/Lecture16/files/java.png");
    String disFile="src/Lecture16/files/java2.png";
    File targetFile = new File(disFile);
    
    try (
      // Create an input stream
      BufferedInputStream input = 
        new BufferedInputStream(new FileInputStream(sourceFile));
      // Create an output stream
      BufferedOutputStream output = 
        new BufferedOutputStream(new FileOutputStream(targetFile));
    ) {
      // Continuously read a byte from input and write it to output
      int byteRead, numberOfBytesCopied = 0;
      byte[] buffer = new byte[BUFFER_SIZE];
    
      while ((byteRead = input.read(buffer)) != -1) {
        output.write(buffer);
        numberOfBytesCopied+=byteRead;
      }
      // Display the file size
      System.out.println(numberOfBytesCopied + " bytes copied");
    }
  }
}


//BufferedInputStream input = 
//        new BufferedInputStream(new DataInputStream(new FileInputStream(sourceFile)));
//      // Create an output stream
//BufferedOutputStream output = 
//  new BufferedOutputStream(new DataOutputStream ( new FileOutputStream(targetFile) ));