package lab12;

public class bicycle extends vehicle {
	int gearsNum = 1;
	
	public bicycle() {
	}
	public bicycle(int speed,int gears) {
		super(speed,2);
		gearsNum = gears;
	}
	public String toString() {
		return super.toString()+"the number of gears is: "+gearsNum+"\n"; 
	}
}
