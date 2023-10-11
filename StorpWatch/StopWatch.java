package lab09;

public class StopWatch {
	private long startTime;
	private long endTime;

	public StopWatch(){
		startTime = System.currentTimeMillis();
		
	}
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	long getStartTime() {
		return startTime;
	}
	long getEndTime() {
		return endTime;
	}
	public long getElapsedTime() {
		long elapsedTime = endTime - startTime ;
		return elapsedTime;
	}
	


}
