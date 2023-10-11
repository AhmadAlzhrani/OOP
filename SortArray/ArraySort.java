package lab23;

public class lab23 {

	public static void main(String[] args) {
		int[]array= new int[30];
		for(int i = 0 ;i<array.length;i++)
			array[i] = (int)(Math.random()*100);
		for(int i =0;i<array.length;i++)
			System.out.println(i+":"+array[i]);
		int x = largest(array);
		System.out.println("ans: "+x);
		
		
		

	}
	public static int largest(int[] array) {
		
		
		if(array.length==1)
			return array[0];
			
		else {
			
			int []tempArray = new int[array.length-1];
			for(int i = 1;i<array.length;i++)
				tempArray[i-1] = array[i];
			int x= largest(tempArray);
			if(array[0]>x)
				return array[0];
			else 
				return x;
			
			}
		}
			
	}
	


