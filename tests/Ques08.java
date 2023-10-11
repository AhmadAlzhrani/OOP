package Lecture15;

import java.io.IOException;

public class Ques08 {
    public static void main(String[] args)  {
        try{
            m(10);
        } catch(ClassNotFoundException ex){ 
        } catch(IOException ex){ 
        }
    }
    
    public static void m(int value) 
            throws IOException,ClassNotFoundException {
        if (value < 40)
            throw new IOException("value is too small");    
    }
}

