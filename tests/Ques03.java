
package Lecture15;

public class Ques03 {
    
    public static void main(String[] args) {
        try {
            int i =0;
            while (i < 3) {
                System.out.print(i + " ");
                System.out.println( i / 0);
            }
        }catch (Exception ex) {
            System.out.println("Exception");
         }
    }
}

