
package Lecture16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestDataStream {
 public static void main(String[] args) throws IOException {
    String fileName = "src/Lecture16/files/names.txt";
    try ( // Create an output stream for file temp.dat
      DataOutputStream output =
        new DataOutputStream(new FileOutputStream(fileName));
    ) {
      // Write student test scores to the file
      output.writeUTF("أحمد");
      output.writeDouble(85.5);
      output.writeUTF("Jim");
      output.writeDouble(185.5);
      output.writeUTF("George");
      output.writeDouble(105.25);
    }

    try ( // Create an input stream for file temp.dat
       DataInputStream input =
        new DataInputStream(new FileInputStream(fileName));
    ) {
      
      while (input.available()!=0 ){
           System.out.println(input.readUTF() + " " + input.readDouble());   
      }
    }
  }
}