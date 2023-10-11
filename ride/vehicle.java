package lab12;

public class vehicle {
	int maxSpeed = 0;
	int wheels = 4;
	public vehicle() {
		
	}
	public vehicle(int speed,int wheel) {
		maxSpeed = speed;
		wheels = wheel;	
	}
	public String toString() {		
		return "the max speed is: "+maxSpeed+"\n"+"the number of wheels is: "+wheels+"\n";
	}
}
