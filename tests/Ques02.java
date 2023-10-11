
package Lecture15;

public class Ques02 {
    
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            try {
                System.out.println( i / 0);
            }
            catch (Exception ex) {
                System.out.println("Exception");
            }
        }
    }
}
