package lab13;

public class undergraduate extends student {
	public undergraduate() {
		super();
	}
	public undergraduate(String id, double gpa) {
		super(id,gpa);
	}
	
	public String getStatus() {
		if(getGpa()>=3)
			return "honor";
		else if (getGpa()>=2)
			return "good";
		else
			return "probation";
	
		}
	}