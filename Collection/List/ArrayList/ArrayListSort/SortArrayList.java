import java.util.*;
public class SortArrayList {

	public static void main(String[] args) {
		
ArrayList<String> listOfCountries = new ArrayList<String>();
		
		listOfCountries.add("India");
		listOfCountries.add("China");
		listOfCountries.add("USA");
		listOfCountries.add("Denmark");
		listOfCountries.add("China");
		//arrayList accept duplicate data/

		ArrayList<String> al2 = new ArrayList<String>();

		//insorted list
		
		System.out.println("Before Sorting ");
		
		for(String counter : listOfCountries)
			System.out.println(counter);
		
		//sort statement 
		Collections.sort(listOfCountries);
		
		//sorted list
		System.out.println("after Sorting ");
				
				for(String counter : listOfCountries)
					System.out.println(counter);
		
	}

}
