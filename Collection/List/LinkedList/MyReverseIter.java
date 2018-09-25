import java.util.*;

class MyReverseIter{
	
	public static void main(String args[])
	{
		
		LinkedList<String> arrl = new LinkedList<String>();
	
		arrl.add("First");
		arrl.add("second");
		arrl.add("third");
		arrl.add("random");
		
		Iterator<String> itr = arrl.descendingIterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}