package lab08;

public class recTest {

	public static void main(String[] args) {
		rec r1 = new rec(4,40);
		double area1 = r1.getArea();
		double peri1 = r1.getPerimeter();
		double h1 = r1.height;
		double w1 = r1.width;
		System.out.println("the area is "+area1);
		System.out.println("the perimeter is "+peri1);
		System.out.println("the height is "+h1);
		System.out.println("the width is "+w1);
		
		System.out.println("------------------------------");
		
		rec r2 = new rec(3.5,35.9);
		double area2 = r2.getArea();
		double peri2 = r2.getPerimeter();
		double h2 = r2.height;
		double w2 = r2.width;
		System.out.println("the area is "+area2);
		System.out.println("the perimeter is "+peri2);
		System.out.println("the height is "+h2);
		System.out.println("the width is "+w2);
	}

}
