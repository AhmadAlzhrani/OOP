
package Lecture16;
import java.io.FileInputStream;
import java.io.IOException;

public class CheckPNGImages {
   private static final int[] PNGIMAGESIGNATURE =
                    {137, 80, 78, 71, 13, 10, 26, 10};
     public static void main(String[] args) {

        String inputFile="src/Lecture16/files/Java.png";
        try (
         FileInputStream inputStream = new FileInputStream(inputFile);
        ) {
            int[] Bytes = new int[8];
            boolean isPNG = true;
            for (int i = 0; i < 8; i++) {
                Bytes[i] = inputStream.read();
                if (Bytes[i] != PNGIMAGESIGNATURE[i]) {
                    isPNG = false;
                    break;
                }
            }
            System.out.println("Is it a PNG file? " + isPNG);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}