import java.util.*;

class LinkedListExample{
	
	public static void main(String args[])
	{
		/*LinkedList declaration*/
		LinkedList<String> linkedList = new LinkedList<String>();
	
		/*add(String Element) is used for adding 
		 * the element to the linked list
		 * */
		linkedList.add("item1");
		linkedList.add("item5");
		linkedList.add("item3");
		linkedList.add("item6");
		linkedList.add("item2");
		
		/*diplaying LinkedList Content*/
		System.out.println("Linked List Content : "+ linkedList);
		
		/*add First and last element*/

		linkedList.addFirst("First item");
		linkedList.addLast("Last item");
		
		System.out.println("Linked List Content after condition : "+ linkedList);
		
		/*this is  how to get and setValues*/

		Object firstVar = linkedList.get(0);
		System.out.println("First Element:" + firstVar);
		linkedList.set(0, "Changed First Item");
		Object firstVar2 = linkedList.get(0);
		System.out.println("First Element after updated by set method:" + firstVar2);
		
		/*Remove first and last element*/
		linkedList.removeFirst();
		linkedList.removeLast();
		
		System.out.println("Linked List after deletion of first and last element : "+ linkedList);
		
		/*add to a position and remove from a position*/
		
		linkedList.add(0,"Newly added item");
		linkedList.remove(2);
		
		System.out.println("Final Content : "+ linkedList);
		System.out.println( linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
	}
}