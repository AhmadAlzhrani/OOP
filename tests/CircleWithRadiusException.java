package Lecture15;

public class CircleWithRadiusException {
  private double radius = 1;
  private static int numberOfObjects = 0;
  public CircleWithRadiusException() 
          throws InvalidRadiusException {
    this(1.0);
  }
 public CircleWithRadiusException(double newRadius) {
    try {
      setRadius(newRadius);
      numberOfObjects++;
    }
    catch (InvalidRadiusException ex) {
        System.out.println(ex.getMessage());
    }
  }
  /** Return radius
     * @return  */
  public double getRadius() {
    return radius;
  }
  /** Set a new radius 
     * @param newRadius
     * @throws Lecture15.InvalidRadiusException */
  public final void setRadius(double newRadius) 
          throws InvalidRadiusException {
    if (newRadius >= 0)
      radius =  newRadius;
    else
      throw new InvalidRadiusException(newRadius);
  }
  /** Return numberOfObjects * @return
     * @return  */
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }
  /** Return the area of this circle 
     * @return n*/
  public double findArea() {
    return radius * radius * 3.14159;
  }
}



