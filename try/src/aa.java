import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class aa {

	public static void main(String[] args) throws FileNotFoundException {
		/*Scanner a1 = new Scanner(System.in);
		System.out.println("type the lenght of the 2d array ");
		int row = a1.nextInt();
		System.out.print("*");
		int colmun = a1.nextInt();
		System.out.println(row+","+colmun);
		int [] [] array = new int [row][colmun];
		for(int i = 0 ; i < row ; i++)
			for ( int j = 0 ; j<colmun;j++) {
				array [i][j] = (int) Math.round(Math.random());
			}
		int count = 1;
		int pr = 0;
		for(int i = 0 ; i < row ; i++)
			for ( int j = colmun-1 ; j > 0;j--) {
				if (array [i][j]== 0)
					System.out.printf("the index is ( %s , %s )\n",i,j);
				else {
					count ++;
					System.out.println("count:"+count);
					pr++;
				}
				if(pr==row*colmun)
					System.out.println("no zeros in the array");
			}
		a1.close();*/
		File file = new File("C:\\Users\\RoXeL.069\\Desktop\\bef.txt");
		File file2 = new File("C:\\Users\\RoXeL.069\\Desktop\\af.txt");
		Scanner scan = new Scanner(file);
		PrintWriter write = new PrintWriter(file2);
		
		String x;
		while (scan.hasNext()== true) {
			x = scan.nextLine();
			
			
			if(x.endsWith("\\n\",")) 
				x = x.substring(0, x.length()-3);
			if(x.startsWith("\""))
				x = x.substring(1, x.length()-1);
			if(x.startsWith("    \""))
				x = x.substring(5, x.length()-1);
			System.out.println(x);
			write.write(x+"\n");
					
		}
		
		
		scan.close();
		write.close();
		
		
	}

}
