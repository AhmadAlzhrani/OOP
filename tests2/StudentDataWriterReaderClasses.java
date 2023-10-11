package Lecture16;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentDataWriterReaderClasses {
     public static void main(String[] args) {
        String outputFile = "src/week09/files/students.txt";
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(1,"Hattan", 'A',true));
        listStudent.add(new Student(1,"Ahmed", 'C',true));
        listStudent.add(new Student(1,"Fatima", 'B',false));
        try {
            StudentWriter1 writer = new StudentWriter1(outputFile);
            for (Student student : listStudent) {
                writer.write(student);
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            StudentReader1 reader = new StudentReader1(outputFile);
            while (reader.isAvailable()) {
                Student student = reader.read();
                System.out.println(student);
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

