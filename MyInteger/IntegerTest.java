package lab10;

public class lab10 {

	public static void main(String[] args) {
		MyInteger i1 = new MyInteger(3);
		MyInteger i2 = new MyInteger(4);
		System.out.println("1st int is "+i1.getVlaue());
		System.out.println("2nd int is "+i2.getVlaue());
		System.out.println("1st int is even: "+i1.isEven());
		System.out.println("2nd int is even: "+i2.isEven());
		System.out.println("1st int is odd: "+i1.isOdd());
		System.out.println("2nd int is odd: "+i2.isOdd());
		System.out.println("1st int is prime: "+i1.isPrime());
		System.out.println("2nd int is prime: "+i1.isPrime());
		System.out.println("7 int is even: "+MyInteger.isEven(7));
		System.out.println("7 int is odd: "+MyInteger.isOdd(7));
		System.out.println("7 int is prime: "+MyInteger.isPrime(7));
		System.out.println("i1 int is even: "+MyInteger.isEven(i1));
		System.out.println("i1 int is odd: "+MyInteger.isOdd(i1));
		System.out.println("i1 int is prime: "+MyInteger.isPrime(i1));
		System.out.println("is 1st = 7 :"+i1.equals(7));
		
		char []x = {'1','2','3'};
		System.out.println(MyInteger.parseInt(x));
		String z = "0987";
		System.out.println(MyInteger.parseInt(z));
		
	}

}
