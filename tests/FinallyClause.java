
package Lecture15;

public class FinallyClause {
    
     public static void main (String[] args) {
         System.out.println(method());
  }
    public static String method(){
        
      try {
        System.out.println("Welcome to ICS108");
        return " ICS";
      }
      finally {
        System.out.println("Finally clause");
        return "108";
      }
    }
}

