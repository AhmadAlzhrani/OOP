package Lecture16;

import java.io.FileReader;

public class ReadingDataFileReader {
  public static void main(String[] args) throws Exception {
    // Create a File instance
    java.io.File file = new java.io.File("src/Lecture16/files/scores.txt");
      
    // Create a Scanner for the file
    FileReader   input = new FileReader(file) ;
    int x;
    while ((x = input.read() )!=-1) {
        System.out.print((char) x);
      }
  }
}