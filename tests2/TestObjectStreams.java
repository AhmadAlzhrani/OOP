package Lecture16;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectStreams {
    public static void main(String[] args) 
            throws FileNotFoundException, 
            IOException, ClassNotFoundException {
        String fileName="src/Lecture16/files/t1.tmp";
        FileOutputStream fos1= new 
                FileOutputStream(fileName);
        try (ObjectOutputStream output = new 
                ObjectOutputStream(fos1)) {
            output.writeInt(12345);
            output.writeUTF("John");
            //output.writeObject(new Date());
            output.writeDouble(85.5);
        }
      
        FileInputStream fos2 = new 
                FileInputStream(fileName);
        try (ObjectInputStream input = new 
                ObjectInputStream(fos2)) {
         
            System.out.println(input.available());
            System.out.println(input.readInt());
            System.out.println(input.readUTF());
            System.out.println( (Date) input.readObject());
            //System.out.println(input.readDouble());
        }
    }
}

