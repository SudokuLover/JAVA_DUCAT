import java.util.*;

class LinkedListLoop{
	
	public static void main(String args[])
	{
		/*LinkedList declaration*/
		LinkedList<String> linkedList = new LinkedList<String>();
	
		linkedList.add("apple");
		linkedList.add("orange");
		linkedList.add("mango");
		
		/*for loop*/
		System.out.println("**for loop**");
		for(int i=0;i<linkedList.size();i++)
		{
			System.out.println(linkedList.get(i));
		}
		
		/*advance for loop*/
		
		System.out.println("**advance for loop**");
		
		for(String str : linkedList)
		{
			System.out.println(str);
		}
		
		/*using iterator*/
		
		System.out.println("**using iterator**");
		
		Iterator<String> i1 = linkedList.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		/*using while loop*/
		System.out.println("**using while loop**");
		int i=0;
		
		while(linkedList.size()>i)
		{
			System.out.println(linkedList.get(i));
			i++;
		}
		
		
	}
}