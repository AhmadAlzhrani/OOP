package Lecture15;

public class InvalidRadiusException extends Exception {
  private double radius; /** Construct an exception */
  public InvalidRadiusException() {
    super("Invalid radius");
  }
  
  /** Construct an exception
     * @param radius */
  public InvalidRadiusException(double radius) {
    super("Invalid radius " + radius);
    this.radius = radius;
  }
  
  /** Return the radius */
  public double getRadius() {
    return radius;
  }
  
}




