import java.util.*;
public class EnsureCapacityExample {

	public static void main(String[] args) {
		
		//ArrayList with capacity 4
		//ArrayList<String> al = new ArrayList<String>(4);
		Vector<String> al = new Vector<String>(4);
		System.out.println(al.capacity());
		
		//adding 4 elements
		
		al.add("hi");
		al.add("hello");
		al.add("bye");
		al.add("GM");
		
		//increase capacity to 5
		al.ensureCapacity(756);
		
		System.out.println(al.capacity());
		System.out.println(al.size());
		
		System.out.println(al);
		
		al.add("GE");
		al.add("GE");
		al.add("GE");
		
		System.out.println(al.size());
		
		
		for(String temp : al)
			System.out.println(temp);
		
	}

}
