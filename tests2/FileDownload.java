package Lecture16;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileDownload {
 public static void main(String[] args) {
    String URLString =
         "https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html";
    
    
    try {
      java.net.URL url = new java.net.URL(URLString); 
      int count = 0;
      Scanner input = new Scanner(url.openStream());
      String newFileName;
      newFileName = 
              URLString.substring(URLString.lastIndexOf("/")+1);
      System.out.println(newFileName);
      
      File targetFile = new File(newFileName);
    
    try ( PrintWriter output = new PrintWriter(targetFile);) {        
      while (input.hasNext()) {
        String line = input.nextLine();
        count += line.length();
        output.println(line);
      }
    }
      System.out.println("The file size is " + count + " characters");
    }
    catch (java.net.MalformedURLException ex) {
      System.out.println("Invalid URL");
    }catch (java.io.IOException ex) {
      System.out.println("IO Errors");
    }
  }
}   


