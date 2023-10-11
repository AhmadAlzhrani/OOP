package hw3;
import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		
		System.out.println("Enter the first complex number: ");       // asking the user to enter complex number
		Scanner nums = new Scanner(System.in);                        
		
		double real1 = nums.nextDouble();                            // scan the numbers as doubles and put it in the corresponding variable
		double imaginary1 = nums.nextDouble();
		
		System.out.println("Enter the second complex number: ");           
		
		double real2 = nums.nextDouble();                                 // the variables for the 2nd complex number 
		double imaginary2 = nums.nextDouble();
		
		nums.close();                                // closing the scanner
		
		Complex num1 = new Complex(real1,imaginary1);                  // make the two objects of type complex 
		Complex num2 = new Complex(real2,imaginary2);
		
		Complex add = num1.add(num2);                                // make the new objects depending on the values of the mathematical methods
		Complex sub = num1.subtract(num2);
		Complex multi = num1.multiply(num2);
		Complex divide = num1.divide(num2);
		
		System.out.println("("+num1.toString()+")"+" + "+"("+num2.toString()+")"+" = "+add.toString());                 // formating and printing the values 
		System.out.println("("+num1.toString()+")"+" - "+"("+num2.toString()+")"+" = "+sub.toString());
		System.out.println("("+num1.toString()+")"+" * "+"("+num2.toString()+")"+" = "+multi.toString());
		System.out.println("("+num1.toString()+")"+" / "+"("+num2.toString()+")"+" = "+divide.toString());
		
		System.out.println(num1.abs());

	}

}
