package hw3;
import java.lang.Math;
public class Complex implements Cloneable, Comparable<Complex> {            // make the class and implement the interfaces
	double realNum;                                                      
	double imaginaryNum;                                                    // the local variables
	double part1;
	double part2;
	double abs;
	public Complex() {                                                     // 1st constructor
		realNum = 0;
		imaginaryNum = 0;
	}
	public Complex(double num1) {                                          // 2nd constructor
		realNum = num1;
		imaginaryNum = 0;
	}
	public Complex(double num1, double num2) {                                // 3rd constructor
		realNum = num1;
		imaginaryNum = num2;
	}
	public int compareTo(Complex num) {                                    // the implemented method in the comparable interface 
		if (abs > num.abs)
			return 1;
		else if(abs < num.abs)
			return -1;
		else 
			return 0;
	}
	public Complex clone() {                                               // the implemented method in the cloneable interface
		try {
		      return (Complex) super.clone();
		    }
		    catch (CloneNotSupportedException ex) {
		      return null;
	  }
	}
	public String toString() {                                              // toString method check if there is 2 parts of the imaginary number or not before returning the value
		if (imaginaryNum ==0)
			return realNum+"";
		else
			return realNum+" + "+imaginaryNum+"i";                    // the format of imaginary number 
	}
	public double getRealPart() {                                      // the getters for the object
		return realNum;
	}
	public double getImaginaryPart() {
		return imaginaryNum;
	}
	public Complex add(Complex num) {
		part1 = num.getRealPart() + realNum;                           // the mathematical methods returning value of type object (complex)
		part2 = num.getImaginaryPart() + imaginaryNum;
		return new Complex(part1,part2);
	}
	public Complex subtract(Complex num) {
		part1 = realNum - num.getRealPart();
		part2 = imaginaryNum - num.getImaginaryPart();
		return new Complex(part1,part2);
	}
	public Complex multiply(Complex num) {
		part1 = num.getRealPart() * realNum - num.getImaginaryPart() * imaginaryNum;
		part2 = imaginaryNum * num.getRealPart() + realNum * num.getImaginaryPart();
		return new Complex(part1,part2);
	}
	public Complex divide(Complex num) {
		part1 = (num.getRealPart() * realNum + num.getImaginaryPart() * imaginaryNum)/(Math.pow(num.getRealPart(),2) + Math.pow(num.getImaginaryPart(),2));
		part2 = (imaginaryNum * num.getRealPart() - realNum * num.getImaginaryPart())/(Math.pow(num.getRealPart(),2) + Math.pow(num.getImaginaryPart(),2));
		return new Complex(part1,part2);
	}
	public String abs() {
		abs = Math.sqrt(Math.pow(realNum, 2) +Math.pow(imaginaryNum, 2));           // the absolute value method returning string in the specific format
		return "|("+realNum+" + "+imaginaryNum+"i"+")|"+" = "+abs;
	}
}
