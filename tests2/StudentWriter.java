package Lecture16;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentWriter {
    private final ObjectOutputStream dataOutput;
 
    public StudentWriter(String outputFile) throws IOException {
        dataOutput = new ObjectOutputStream(new FileOutputStream(outputFile));
    }
 
    public void write(Student student)  {
        try {
            dataOutput.writeObject(student);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
 
    public void close() throws IOException {
        dataOutput.close();
    }
}