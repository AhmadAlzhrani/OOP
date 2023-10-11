package lab15;
import java.util.Scanner;
public class lab15 {

	public static void main(String[] args) throws Exception {
		
		System.out.print("Enter a letter grade: ");
		Scanner in = new Scanner(System.in);
		String grade = in.next();
		in.close();
		
		try {
			double result = points(grade);
			System.out.println("The quality points  "+result);
		}
		catch(Exception ex){
			System.out.println("Invalid grade");
		}
	}
	public static double points(String grade) throws Exception {
		if (grade.equalsIgnoreCase("A+"))
			return 4.00;
		else if (grade.equalsIgnoreCase("A"))
			return 3.75;
		else if (grade.equalsIgnoreCase("B+"))
			return 3.50;
		else if (grade.equalsIgnoreCase("B"))
			return 3.00;
		else if (grade.equalsIgnoreCase("C+"))
			return 2.5;
		else if (grade.equalsIgnoreCase("C"))
			return 2.0;
		else if (grade.equalsIgnoreCase("D+"))
			return 1.5;
		else if (grade.equalsIgnoreCase("D"))
			return 1.00;
		else if (grade.equalsIgnoreCase("F"))
			return 0.00;
		else 
			throw new Exception("");

	}
}


