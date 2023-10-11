package lab09;
public class lab09 {

	public static void main(String[] args) {
		int x[]= new int [100000];
		for(int i=0;i<x.length;i++)
			x[i] = (int) (Math.random()*100) ;
		StopWatch a1 = new StopWatch();
		a1.start();
		selectionSort(x);
		a1.stop();
		System.out.println("the time required for the operation is "+a1.getElapsedTime());

	}
	public static void selectionSort(int[] list) {
	    for (int i = 0; i < list.length - 1; i++) {
	      // Find the minimum in the list[i..list.length-1]
	      int currentMin = list[i];
	      int currentMinIndex = i;

	      for (int j = i + 1; j < list.length; j++) {
	        if (currentMin > list[j]) {
	          currentMin = list[j];
	          currentMinIndex = j;
	        }
	      }

	      // Swap list[i] with list[currentMinIndex] if necessary;
	      if (currentMinIndex != i) {
	        list[currentMinIndex] = list[i];
	        list[i] = currentMin;
	      }
	    }
	  }
}
