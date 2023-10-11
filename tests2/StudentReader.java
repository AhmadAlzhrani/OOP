package Lecture16;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentReader {
    private final ObjectInputStream dataInput;
    
    public StudentReader(String inputFile) throws IOException {
        dataInput = new ObjectInputStream(new FileInputStream(inputFile));
    }
 
    public Student read()   {
        try {
            return (Student) dataInput.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            //System.out.println(ex.getMessage());
            return null;
        }
    }
 
    public void close() throws IOException {
        dataInput.close();
    }
}