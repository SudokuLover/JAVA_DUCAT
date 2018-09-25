import java.util.*;

class MyListElement{
	
	public static void main(String args[])
	{
		
		LinkedList<String> arrl = new LinkedList<String>();
	
		/*arrl.add("First");
		arrl.add("second");
		arrl.add("third");
		arrl.add("random");
		*/
		System.out.println("Last Element:"+arrl.peekLast());
		
		System.out.println("Last Element:"+arrl.getLast());
		
		System.out.println("List Element"+arrl);
		
		
	}
}