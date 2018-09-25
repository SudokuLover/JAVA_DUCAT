import java.util.*;
public class ArrayToArrayList {

	public static void main(String[] args) {
		
		/*array declaration and initialization*/
		
		String cityNames[] = {"Agra","Mysore","Chandigarh","Bhopal"};
		
		
		List<String> l= Arrays.asList(cityNames);
		
		/*array to arraylist conversion*/
		
		ArrayList<String> cityList= new ArrayList<String>(l);
	
		cityList.add("new city2");
		cityList.add("new city3");
		
		
		for(String k:cityList)
			System.out.println(k);
	}

}
