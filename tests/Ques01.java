
package Lecture15;

public class Ques01 {
    
    public static void main(String[] args) {
     String str="1.2r";
Double.parseDouble(str);

        try {
          int value = 30;  //value = 5;
          if (value % 2 == 0)
             throw new Exception("value is even");
          System.out.println("exit normally");
        }    
        
        catch (Exception ex) {
          System.out.println(ex.getMessage());
        }
        
        System.out.println("Continue after the try/catch block");
      }  
}
