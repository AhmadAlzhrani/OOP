package lab17;
import java.io.*;
import java.util.Random;
public class lab17 {

	public static void main(String[] args) throws IOException {
		ObjectOutputStream output1 = new ObjectOutputStream(new FileOutputStream("BinaryFile.dat"));
		PrintWriter output2 = new PrintWriter("TextFile.dat");
		Random rand = new Random();
		for (int i = 0 ; i<1000000 ; i++) {
			output1.writeInt(rand.nextInt());
			output2.print(rand.nextInt());
		}
		output1.close();
		output2.close();
		File op1 = new File("BinaryFile.dat");
		File op2 = new File("TextFile.dat");
		System.out.println(op1.length());
		System.out.println(op2.length());
		

	}

}
