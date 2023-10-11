package lab10;
public class MyInteger {
	private int value = 0;
	public MyInteger(int x) {
		value = x;
	}
	public int getVlaue() {
		return value;
	}
	public boolean isEven() {
		if (value%2 == 0)
			return true;
		else
			return false;
	}
	public boolean isOdd() {
		if (value%2 == 1)
			return true;
		else
			return false;
	}
	public boolean isPrime() {
		int x = 0;
		for (int i = 2 ; i<value ; i++) {
			if(value % i ==0) 
				x = 1;
		}
		if (x==0)
			return true;
		else
			return false;
	}
	public static boolean isEven(int x) {
		if (x%2 == 0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(int x) {
		if (x%2 == 1)
			return true;
		else
			return false;
	}
	public static boolean isPrime(int x) {
		int z = 0;
		for (int i = 2 ; i<x ; i++) {
			if(x % i ==0) 
				z = 1;
		}
		if (z==0)
			return true;
		else
			return false;
	}
	public static boolean isEven(MyInteger x) {
		if (x.getVlaue()%2 == 0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(MyInteger x) {
		if (x.getVlaue()%2 == 1)
			return true;
		else
			return false;
	}
	public static boolean isPrime(MyInteger x) {
		int z = 0;
		for (int i = 2 ; i<x.getVlaue() ; i++) {
			if(x.getVlaue() % i ==0) 
				z = 1;
		}
		if (z==0)
			return true;
		else
			return false;
	}
	public boolean equals(int x) {
		if (value == x)
			return true;
		else
			return false;
	}
	public boolean equals(MyInteger x) {
		if (value == x.getVlaue())
			return true;
		else 
			return false;
	}
	public static int parseInt(char []x) {
		String z = "";
		for (int i = 0;i<x.length;i++)
			z += x[i];
		return Integer.parseInt(z);
	}
	public static int parseInt(String x) {
		return Integer.parseInt(x);
	}
}
