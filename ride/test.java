package lab12;

public class lab12 {

	public static void main(String[] args) {
		vehicle objArray [] = {new vehicle(120,4),new vehicle(160,6), new bicycle(33,9),new bicycle(45,12)};
		for (int i =0; i< objArray.length;i++)
			System.out.println(objArray[i].toString());

	}

}
