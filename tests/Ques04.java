
package Lecture15;

import java.util.InputMismatchException;

public class Ques04  {
    
    public static void m(){
      try {m();}
      catch(StackOverflowError e ){
      System.out.println(e.getMessage());}
    
    }
    
    public static void main(String[] args) {
      // m();
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            try {
                System.out.println( i / 0);
            }
            catch (InputMismatchException ex) {
                System.out.println("Exception");
            }
        }
    }
}
