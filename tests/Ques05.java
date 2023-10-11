package Lecture15;

public class Ques05 {
  public static void main(String[] args) {
    try {
      int[] list = new int[5];
      System.out.println("list[5] is " + list[5]);      
    }   
    catch (ArithmeticException ex) {
      System.out.println("ArithmeticException");   
    }   
    catch (RuntimeException ex) {
      System.out.println("RuntimeException");   
    }   
    catch (Exception ex) {   
      System.out.println("Exception");   
    }   
  }
}