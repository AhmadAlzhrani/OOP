package testing;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class read {
 
    public static void main(String[] args) throws IOException {
    	/*ObjectOutputStream output1 = new ObjectOutputStream(new FileOutputStream("QuestionBank.dat"));
		ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("QuestionBank.dat"));
		FileOutputStream out = new FileOutputStream(new File("QuestionBank.dat"));
		FileInputStream in = new FileInputStream(new File("QuestionBank.dat"));
    	ArrayList<String> a = new ArrayList<String>();
    	a.add("a");
    	for(String s:a)
    		output1.write*/
    	ArrayList<String> Qs = new ArrayList<String>(2);
		Qs.add("what");
		Qs.add("what");
    		
    	DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
    	for(String a:Qs)
    		output.writeUTF(a);
    	
    	DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
    	
    	System.out.println(input.readUTF());
    	
    	output.close();
    	input.close();
    			
    }
 
   
}