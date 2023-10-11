package lab16;
import java.io.FileNotFoundException;

public class lab16 {

	public static void main(String[] args) throws FileNotFoundException {
		java.io.File file = new java.io.File("LetterGrades.txt");
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		String grades [] = {"A+","A","B+","B","C+","C","D+","D","F","W","WP","WF","DN"};
		for(int i =0; i< Math.random()*100 ;i++ )
			output.println(grades [(int)(Math.random()*grades.length)]);
		output.close();

	}

}
