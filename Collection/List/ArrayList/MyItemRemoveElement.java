import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class MyItemRemoveElement{
	
	public static void main(String args[])
	{
		String removeElement = "perl";
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("java");
		myList.add("unix");
		myList.add("oracle");
		myList.add("c++");
		myList.add("perl");
		myList.add("perl");
		myList.add("perl");
		
		System.out.println("Before remove:");
		
		System.out.println(myList);
		
		Iterator<String> itr = myList.iterator();
		
		while(itr.hasNext())
		{
			if(removeElement.equals(itr.next()))
			{
				itr.remove();
			}
		}
		
		System.out.println("after remove:");
		System.out.println(myList);
		
	}
}