package lab08;

public class rec {
	double height;
	double width;
	
	public rec() {
		height = 1;
		width = 1;
	}
	public rec(double x,double y) {
		height = x;
		width = y;
	}
	public double getArea() {
		return height*width;
	}
	public double getPerimeter() {
		return 2*height+2*width;
	}
}
