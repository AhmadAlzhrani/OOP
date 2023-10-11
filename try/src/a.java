import java.util.*;
public class a {

    public static void main(String[] args) {
        System.out.print("Enter a letter grade: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
      

        if (str == "A+")
            System.out.print(4.0);
        else if (str == "A")
            System.out.print(3.75);
        else if (str == "B+")
            System.out.print(3.5);
        else if (str == "B")
            System.out.print(3.0);
        else if (str == "C+")
            System.out.print(2.5);
        else if (str == "C")
            System.out.print(2.0);
        else if (str == "D+")
            System.out.print(1.5);
        else if (str == "D")
            System.out.print(1.0);
        else if (str == "F")
            System.out.print(0.0);
        
        input.close();
    }

}