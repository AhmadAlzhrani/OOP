package lab11;

public class student extends person {
	String status = "";
	double gpa = 0.0;
	public student (String a, String b, String c,String x,double y) {
		super(a,b,c);
		status = x;
		gpa = y;
	}
	public String toString() {
		return "name:"+name+"\n"+"phone number:"+"\n"+"email:"+email+"\n"+"status:"+status+"\n"+"GPA:"+gpa+"\n";
		
	}
}
