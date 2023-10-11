

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;

//Declaring the "Save" class which stores the questions and answers made by the user into an array list during a session
//And then storing them directly into the file when the user hits the "Save & Exist" button.
public class Save {
	
	
	ArrayList<Mcq> Qs ;		//
	//ArrayList<String> As ;		//
	DataOutputStream output;	//Declaring global variables and input and output objects to be used inside the class.
	DataInputStream input;		//
	BufferedReader count;		//
	File file;					//
	
	public Save(String fileName) throws Exception {
		
		file = new File(fileName);
		
	}
	public void read() throws Exception {
		input = new DataInputStream(new FileInputStream(file));                  // using data input stream and buffer reader to read the file 
    	count = new BufferedReader(new FileReader(file));
    	Qs = new ArrayList<Mcq>();                                               // temporary array for the questions
    	
    	int qNum = input.read();
    	
    	for(int i=0;i<qNum;i++) {
    		Qs.add(new Mcq( input.readUTF(),input.readUTF(),input.readUTF(),input.readUTF(),input.readUTF()));
    	}																		// reading the file and save the question and the answers as object
    	
	}
	@SuppressWarnings("unchecked")
	public void write(Object a, int size) throws Exception{
		output = new DataOutputStream(new FileOutputStream(file));                          // using data output stream to write in the file
		ArrayList<Mcq> Qs = (ArrayList<Mcq>)(a);
	
		output.write(size);
    	for(int i =0 ; i<Qs.size() ; i++ ) {													// writing the data with specific format
			output.writeUTF( Qs.get(i).toString() );
	    	output.writeUTF( Qs.get(i).getRightAnswer() );
	    	output.writeUTF( Qs.get(i).getWrongAnswer1() );
	    	output.writeUTF( Qs.get(i).getWrongAnswer2() );
	    	output.writeUTF( Qs.get(i).getWrongAnswer3() );
	    	
    	}
    	output.close();                                                 // close streams
    	if(input!=null )
    		input.close();
    	if(count!=null)
    		count.close();
	
	}
}
