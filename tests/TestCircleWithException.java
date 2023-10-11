package Lecture15;
public class TestCircleWithException {
  public static void main(String[] args) {
    try {
      CircleWithException c1 = new CircleWithException(5);
      CircleWithException c2 = new CircleWithException(-5);
      CircleWithException c3 = new CircleWithException(-1);
    }
    catch (IllegalArgumentException ex) {
      System.out.println(ex);
      System.out.println(ex.toString());
      System.out.println(ex.getMessage());
    }

    System.out.println("Number of objects created: " +
      CircleWithException.getNumberOfObjects());
  }
}

class pp{}