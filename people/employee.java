package lab11;

public class employee extends person{
	String office = "";
	double salary = 0.0;
	String date = "";
	public employee(String a, String b, String c,String x, double y, String z) {
		super(a,b,c);
		office = x;
		salary = y;
		date = z;
	}
	public String toString() {
		return "name:"+name+"\n"+"phone number:"+phoneNum+"\n"+"email:"+email+"\n"+"office:"+office+"\n"+"salary:"+salary+"\n"+"date:"+date+"\n";
		
	}

}
