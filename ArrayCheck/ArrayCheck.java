package hw2;
import java.util.*;                        //import scanner to use
public class hw2 {

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
	public static boolean equals(int[][] m1, int[][] m2) {                  // the used method 
		double [][] newArray1 = new double [3][3];                        // we use temporary arrays to store the values as integers
		double [][] newArray2 = new double [3][3];                       
		for (int w=0;w<3;w++)                                          // a loop to store the store the values 
			for(int s=0;s<3;s++) {
				newArray1[w][s] = (double) m1[w][s];
				newArray2[w][s] = (double) m2[w][s];
			}
		int checkNums = 0;                                    // a check variable to count the identical elements
		for(int i =0;i<3;i++) {                                   // nested loop (4 loops) to check the elements one by one 
			boolean checkValue = false;                         // double check value (boolean) if the  specific element  
			for(int j =0;j<3;j++) {
				checkValue = false;                             // put it false again so it wont break out of the loop 
				for(int k =0;k<3;k++) {
					if(checkValue==true)                 // check boolean value to break or not 
						break;
					for(int a =0;a<3;a++) {
						if (newArray1[i][j]==newArray2[k][a]) {          // compare the specific elements in the arrays
							checkNums += 1;                                      
							checkValue = true;
							newArray1[i][j] = 1.5;                      // change the temporary arrays so it wont repeat the same numbers
							newArray2[k][a] = 1.5;        // by changing the identical values to double it will eliminate the identified values
							break;                     // break to the second loop
						}
					}
				}
					
			}
		}
		if (checkNums==9)                           // the check value for the elements ( it should be 9 in 3*3 array)
			return true;
		else
			return false;
	}

}
