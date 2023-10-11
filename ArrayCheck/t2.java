package hw2;
import java.util.Scanner;
public class t2 {
	public static void main(String[] args) {
		System.out.println("write m1 :");                  // user input m1
		Scanner input = new Scanner(System.in);              // the  scanner
		int [][]array1 = new int [3][3];                            // put the numbers in array first
		for (int i=0;i<3;i++)                                // loop to make the array
			for(int z=0;z<3;z++)
				array1[i][z] = input.nextInt();                                   
		System.out.println("write m2 :");                        // user input m2          
		int [][]array2 = new int [3][3];                            // loop put the numbers array 
		for (int i=0;i<3;i++)                                // 2d array
			for(int z=0;z<3;z++)
				array2[i][z] = input.nextInt();
		input.close();                                      //close scanner
		if(equals(array1,array2)== true)
			System.out.println("The two arrays are identical.");        // determine if the arrays are identical or not by if statement
		else 
			System.out.println("The two arrays are not identical.");
	}
	public static boolean equals(int[][] m1, int[][] m2) {
		int checker = 0;
		for (int a = 0;a<3;a++)
			for (int b =0;b<3;b++) {
				if(checker == 9)
					break;
				checker = 0;
				for (int c=0;c<3;c++)
					for(int d=0;d<3;d++) {
						if (m1[a][b] != m2[c][d])
							checker += 1 ;
					}
			}
		return (checker != 9);
	}
}
