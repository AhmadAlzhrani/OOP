package lab14;

import java.util.Arrays;

public class lab14 {

	public static void main(String[] args) {
		City [] cities = {new City("a",10),
				         new City("b",20),
				         new City("c",30),
				         new City("d",10),
				         new City("d",10),
				         };
		cities[4] = cities[3].clone();
		
		for( int i =0;i<cities.length;i++)
			System.out.println("the two cities have the same temp: "+cities[i].compareTo(cities[1]));
		Arrays.sort(cities);
		for (int i=0;i<cities.length;i++)
			System.out.println(cities[i].toString());
	}

}
