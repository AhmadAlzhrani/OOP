package Lecture16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentWriterReader {
     public static void main(String[] args) {
        String outputFile = "src/week09/files/students.txt";
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(1,"Hattan", 'A',true));
        listStudent.add(new Student(1,"Ahmed", 'C',true));
        listStudent.add(new Student(1,"Fatima", 'B',false));
        try {
            DataOutputStream dataOutput = 
                    new DataOutputStream(new FileOutputStream(outputFile));
            for (Student student : listStudent) {
                dataOutput.writeInt(student.getId());
                dataOutput.writeUTF(student.getName());
                dataOutput.writeChar(student.getGrade());
                dataOutput.writeBoolean(student.getGender());
            }
            dataOutput.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            DataInputStream dataInput = 
                    new DataInputStream(new FileInputStream(outputFile));
            while( dataInput.available()>0) {
                int stdId         = dataInput.readInt();
                String stdName    = dataInput.readUTF();
                char stdGrade     = dataInput.readChar();
                boolean stdGender = dataInput.readBoolean();
                System.out.println(stdId + " " + stdName + 
                        " " + stdGrade + " "+stdGender);
            }
            dataInput.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}