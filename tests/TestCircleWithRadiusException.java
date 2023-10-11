package Lecture15;

public class TestCircleWithRadiusException {
    public static void main(String[] args) {
        CircleWithRadiusException c1 = new CircleWithRadiusException(-10);
        System.out.println(c1.getRadius());
        try {
          c1.setRadius(-5); 
        }
        catch (InvalidRadiusException ex) {
          System.out.println(ex.getRadius());
        }
        CircleWithRadiusException c2 = new CircleWithRadiusException(10);
        CircleWithRadiusException c3 = new CircleWithRadiusException(5);
        System.out.println("Number of objects created: " +
        CircleWithRadiusException.getNumberOfObjects());
      }
}


class ffff{}