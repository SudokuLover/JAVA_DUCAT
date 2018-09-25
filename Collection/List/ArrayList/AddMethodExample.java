import java.util.*;

class AddMethodExample{
	
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println(al.size());
		
		al.add("hi");
		al.add("hello");
		al.add("string");
		al.add("test");
		al.add(3,"lalu");
		
		System.out.println(al);
		
		al.add(0,"bye");
	
		System.out.println("elements after adding string bye: " + al);
		
	}
	
}