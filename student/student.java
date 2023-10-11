package lab13;

abstract class student {
	private String id;
	private double gpa;
	public student() {
		setId("");
		setGpa(0.0);
	}
	public student(String id,double gpa) {
		this.setGpa(gpa);
		this.setId(id);
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public abstract String getStatus();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
