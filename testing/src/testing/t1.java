package testing;

public class t1 {

	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for (int i = 0; i < n-1 ; i++) {
			for (int j = i; j < n-1 ; j++)
				sum ++;
			System.out.println ("sum for subarray 0 through " + i + " is " + sum);
			}
		int counter =0;
		for(int i = 1; i <= 64; i = i * 2) counter++;
		System.out.println("After loop 1, counter = " + counter);
		
		counter = 0;
		for(int i = 1; i <= 27; i = i * 3)
			for(int j = 1; j <= i; j = j + 1)
				counter++;
		System.out.println("After loop 4, counter = " + counter);



		
		/*int $9a = 4;
		final float MAX_XX = (float)99.4;
		int xs = 9;
		System.out.println(-24%-5);
		System.out.println(Math.pow(MAX_XX, xs));
		int c = 9;
		float mm = -23;
		xs *= xs +1;
		System.out.println(xs);
		boolean n = true;
		if(n == false)
			System.out.println("fff");
		int s = 10000 * 10000 * 10000;
		char z ='x'+1;
		System.out.println(++z);
		String xx = "java"+1+2+3;
		System.out.println(xx);
		String s1 = "fkgbb";
		System.out.println("");
		System.out.println(1/2);
		double sum = 0;
		for (double d = 0; d < 10; sum += sum + d)  {  
		  d += 0.1;
		}
		int i = 0;
	    for (i = 0; i < 10; i++);
	      System.out.println(i+4);
	
		Math.pow(2, 3);
		int []a = new int[2];
		int[] x = new int[3];
		System.out.println("x[0] is " + x[0]);
		double[] xf = {2.5, 3, 4};
		int ii;
		int[] xh = {120, 200, 016};
		for (int ss = 0; ss < xh.length; ss++)
		      System.out.print(xh[ss] + " ");
		int[] list = new int[5];
		list = new int[6];
		boolean[][] xss = new boolean[3][];
		String ss;
		int sss =0 ;
		double b = 1.0;
	    System.out.println(b/sss);*/
		    
		}
	}


