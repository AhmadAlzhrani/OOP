
package Lecture15;

import java.util.Scanner; 
public class Quotient01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Prompt the user to enter two integers
    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    
    if( number2 != 0){
       System.out.println("Result is " +
       (number1 / number2) );
    } else{
        System.out.println("Division by zero.");
    }
  }
}

class ddd{}
