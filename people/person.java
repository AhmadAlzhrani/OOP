package lab11;

public class person {
	String name = "";
	String phoneNum ="";
	String email = "";
	public person(String x, String y, String z) {
		name = x ;
		phoneNum = y;
		email = z;
	}
	public String toString() {
		return "name:"+name+"\n"+"phone number:"+"\n"+"email:"+email+"\n";
		
	}
}
