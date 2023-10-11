
package Lecture15;

import java.util.Scanner; 
public class Quotient02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Prompt the user to enter two integers
    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    
    try{
       System.out.println("Result is " +
       (number1 / number2) );
    } catch(ArithmeticException e){
        System.out.println("Division by zero.");
    }
  }
}


