import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class MyListIterator{
	
	public static void main(String args[])
	{
		List<Integer> li = new ArrayList<Integer>();
		ListIterator<Integer> litr =null;
		li.add(23);
		li.add(96);
		li.add(16);
		li.add(43);
		li.add(56);
		
		litr = li.listIterator();
		
		System.out.println("Elements in forwarded direction:");
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("Elements in backward direction:");
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}
}