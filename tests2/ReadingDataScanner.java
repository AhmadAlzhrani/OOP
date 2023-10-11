package Lecture16;

import java.util.Scanner;

public class ReadingDataScanner {
  public static void main(String[] args) throws Exception {
    // Create a File instance
    java.io.File file = new java.io.File("src/Lecture16/files/scores.txt");
      
    // Create a Scanner for the file
    Scanner input = new Scanner(file) ;
    while (input.hasNext()) {
        String firstName = input.next();
        String mi = input.next();
        String lastName = input.next();
        int score = input.nextInt();
        //String score = input.next();
        System.out.println(
                firstName + " " + mi + " " + lastName + " " + score);

      }
  }
}