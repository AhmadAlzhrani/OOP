package Lecture16;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class StudentReader1 {
    private final DataInputStream dataInput;
    
    public StudentReader1(String outputFile) throws IOException {
        dataInput = new DataInputStream(new FileInputStream(outputFile));
    }
 
    public Student read() throws IOException {
        int stdId = dataInput.readInt();
        String stdName = dataInput.readUTF();
        char stdGrade = dataInput.readChar();
        boolean stdGender = dataInput.readBoolean();
        return new Student(stdId,stdName,stdGrade,stdGender);
    }
 
    public void close() throws IOException {
        dataInput.close();
    }
    
    public boolean isAvailable(){
        try{
            return dataInput.available()>0;
        }catch(IOException ex)
        {
            return false;
        }
    }
}