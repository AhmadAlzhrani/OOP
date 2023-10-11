
package Lecture15;

public class RethrowingExceptions {
public static void main(String[] args) {
    try {
      method();
      System.out.println("After the method call");
    }
    catch (RuntimeException ex) {
      System.out.println("RuntimeException Main");
    }
    catch (Exception ex) {
      System.out.println("Exception Main");
    }
  }

  static void method() throws Exception {
    try {
      int i = 0;
      int y = 2 / i;
      System.out.println("Welcome to Java");
    }
    catch (ArithmeticException ex) {
      System.out.println("ArithmeticException");
      throw ex;
    }
    catch (RuntimeException ex) {
      System.out.println("RuntimeException Method");
    }
  }
}