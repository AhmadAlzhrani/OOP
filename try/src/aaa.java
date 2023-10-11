import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3];                  //Defining of the integer array m1.
        int[][] m2 = new int[3][3];                  //Defining of the integer array m2.
		Scanner input = new Scanner(System.in);
		input.close();
        System.out.println("Enter m1");              //The for loop below is used to set a value for each item in the array m1.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter m2");              //The for loop below is used to set a value for each item in the array m2.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = input.nextInt();
            }
        }

        //The if block below prints whether the two arrays are identical or not based what the method "equals" returns.
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical.");
        }
        
       
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int check =0;
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int[] arrays:m2) {
                    for (int m2Element : arrays){
                        if (m1[i][j] == m2Element) {
                            check++;
                            temp++;
                            break;
                        }
                    }
                    if (temp != 0) {temp =0; break;}
                }
            }
        }
        return check == 9;
    }
}