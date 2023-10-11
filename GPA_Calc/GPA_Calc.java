package hw1;
import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		
		System.out.println("enter numbers of courses");
		Scanner info = new Scanner (System.in);
		int x = info.nextInt();
		String grade[] = new String [x];
		int hours[] = new int [x];
		String y[] = new String [x];
		for (int i = 0 ; i < x ; i++) {
			System.out.println("enter code, garde and hours");
			y[i] = info.next();
			grade[i] = info.next();
			hours[i] = info.nextInt();
		}
		info.close();
		double points[] = getPoints(grade);
		double gpa = getGPA(points,hours);
		System.out.println("GPA calculations \n");
		System.out.println("Course     Grade     Points     Hours");
		for (int z = 0; z<x ; z++)
			System.out.printf("%-10s %-9s %-10.2f %d \n",y[z],grade[z],points[z],hours[z]);
		System.out.printf("\nthe GPA is %.2f \n ",gpa);
	}
	public static double[] getPoints(String[] grade) {
		double points[] = new double [grade.length];
		for (int i = 0 ; i < grade.length; i++) {
			if (grade[i].toUpperCase().equals("A+"))
				points[i] = 4.00;
			else if (grade[i].toUpperCase().equals("A"))
				points[i] = 3.75;
			else if (grade[i].toUpperCase().equals("B+"))
				points[i] = 3.50;
			else if (grade[i].toUpperCase().equals("B"))
				points[i] = 3.00;
			else if (grade[i].toUpperCase().equals("C+"))
				points[i] = 2.50;
			else if (grade[i].toUpperCase().equals("C"))
				points[i] = 2.00;
			else if (grade[i].toUpperCase().equals("D+"))
				points[i] = 1.50;
			else if (grade[i].toUpperCase().equals("D"))
				points[i] = 1.00;
			else 
				points[i] = 0.00;
		}
		return points;
	}
	public static double getGPA(double[] points, int[] hours) {
		double up = 0;
		double down = 0;
		for (int i = 0 ; i < hours.length ; i++) {
			up += points[i]*hours[i];
			down += hours[i];	
		}
		return up/down;
	}
}
