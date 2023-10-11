package lab13;

public class graduate extends student{
	public graduate() {
		super();
	}
	public graduate(String id, double gpa) {
		super(id,gpa);
	}
	public String getStatus() {
		if(getGpa()>=3)
			return "good";
		else
			return "probation";
	}
}
