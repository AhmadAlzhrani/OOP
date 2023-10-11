package lab25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class lab25 {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> ids = new ArrayList<String>();
		File file = new File("C:\\Users\\RoXeL.069\\Desktop\\IDsWithDuplicates.txt");
		Scanner scan = new Scanner(file);
		String temp;
		while (scan.hasNext()== true) {
			temp = scan.next();
			if(ids.indexOf(temp)==-1)
				ids.add(temp);
			else {}
		}
		PrintWriter write = new PrintWriter(file);
		for(int i = 0 ; i< ids.size() ; i++)
			write.print(ids.get(i)+"\n");
		
		
		scan.close();
		write.close();
		for(int i = 0 ; i < ids.size() ; i++)
			System.out.println(ids.get(i));	

	}

}
