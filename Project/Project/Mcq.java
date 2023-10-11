

public class Mcq {
	String question;
	String rightAnsewr;    // declaring data fields
	String wrongAnswer1;
	String wrongAnswer2;
	String wrongAnswer3;
	public Mcq(String q,String a,String wa1,String wa2,String wa3) {
		
		question = q;                                                // constructor with 5 arguments
		rightAnsewr = a;
		wrongAnswer1 = wa1;
		wrongAnswer2 = wa2;
		wrongAnswer3 = wa3;
		
	}
	public String toString() {
		return question;													// basic methods to use in the main class
	}																		// every method return 1 answer 
	public String getRightAnswer() {										// toString method return the question
		return rightAnsewr;
	}
	public String getWrongAnswer1() {
		return wrongAnswer1;
	}
	public String getWrongAnswer2() {
		return wrongAnswer2;
	}
	public String getWrongAnswer3() {
		return wrongAnswer3;
	}
}
