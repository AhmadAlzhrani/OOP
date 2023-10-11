package Lecture16;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class StudentWriter1 {
    private final DataOutputStream dataOutput;
    
 
    public StudentWriter1(String outputFile) throws IOException {
        dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
    }
 
    public void write(Student student) throws IOException {
        dataOutput.writeInt(student.getId());
        dataOutput.writeUTF(student.getName());
        dataOutput.writeChar(student.getGrade());
        dataOutput.writeBoolean(student.getGender());
    }
 
    public void close() throws IOException {
        dataOutput.close();
    }
}