package Lecture16;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentObjectWriterReaderClasses {
    public static void main(String[] args) {
        String fileName = "src/Lecture16/files/students.txt";
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(1,"Hattan", 'A',true));
        listStudent.add(new Student(1,"Ahmed", 'C',true));
        listStudent.add(new Student(1,"Fatima", 'B',false));
        try {
            StudentWriter writer = new StudentWriter(fileName);
            for (Student student : listStudent) {
                writer.write(student);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            StudentReader reader = new StudentReader(fileName);
            Student student= (Student) reader.read();
            while ( student  !=null) {
                 System.out.println(student);
                 student = (Student) reader.read();
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
