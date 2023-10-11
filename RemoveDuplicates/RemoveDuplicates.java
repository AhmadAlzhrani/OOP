package lab26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class lab26 {

	public static void main(String[] args) throws FileNotFoundException {
		TreeSet<String> ids = new TreeSet<String>();
		File file = new File("C:\\Users\\RoXeL.069\\Desktop\\IDsWithDuplicates.txt");
		File file2 = new File("C:\\Users\\RoXeL.069\\Desktop\\IDsWithoutDuplicates.txt");
		Scanner scan = new Scanner(file);
		
		while (scan.hasNext()== true) {
			ids.add(scan.next());
		}
		PrintWriter write = new PrintWriter(file2);
		
		for(String a: ids)
			write.print(a+"\n");
		
		scan.close();
		write.close();
		for(String a: ids)
			System.out.println(a);	

	}

}
