import java.util.*;
public class CompareArrayList {

	public static void main(String[] args) {
		
ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("hi");
		al1.add("how are you");
		al1.add("Good Morning");
		al1.add("bye");
		al1.add("Good Night");

		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("howdy");
		al2.add("Good Evening");
		al2.add("bye");
		al2.add("Good Night");
		
		//starting the converson output in ArrayList<String>;
		
		ArrayList<String> al3 = new ArrayList<String>();
		
		for(String temp : al1)
			al3.add(al2.contains(temp)?"Yes":"No");
		
		System.out.println(al3);
		
		//starting the converson output in ArrayList<Integer>;
		
		ArrayList<Integer> al4 = new ArrayList<Integer>();
		
		for(String temp1 : al1)
			al4.add(al2.contains(temp1)?1:0);
		
		System.out.println(al4);
		
	}

}
