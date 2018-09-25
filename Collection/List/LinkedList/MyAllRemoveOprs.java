import java.util.*;

class MyAllRemoveOprs{
	
	public static void main(String args[])
	{
		
		LinkedList<String> arrl = new LinkedList<String>();
	
		arrl.add("First");
		arrl.add("second");
		arrl.add("third");
		arrl.add("five");
		arrl.add("random");
		arrl.add("four");
		arrl.add("five");
		arrl.add("seven");
		arrl.add("eight");
		arrl.add("nine");
		arrl.add("eight");
		
		System.out.println(arrl);
		
		System.out.println("remove() method"+arrl.remove());
		System.out.println("after remove() method call");
		System.out.println(arrl);
		
		System.out.println("remove(index) method"+arrl.remove(2));
		System.out.println("after remove(index) method call");
		System.out.println(arrl);
		
		System.out.println("remove(object) method"+arrl.remove("five"));
		System.out.println("after remove(object) method call");
		System.out.println(arrl);
		
		System.out.println("removeFirst() method"+arrl.removeFirst());
		System.out.println("after removeFirst() method call");
		System.out.println(arrl);
		
		System.out.println("removeFirstOccurrence() method"+arrl.removeFirstOccurrence("eight"));
		System.out.println("after removeFirstOccurrence() method call");
		System.out.println(arrl);
		
		System.out.println("removeLast() method"+arrl.removeLast());
		System.out.println("after removeLast() method call");
		System.out.println(arrl);
		
		System.out.println("removeLastOccurrence() method"+arrl.removeLastOccurrence("five"));
		System.out.println("after removeLastOccurrence() method call");
		System.out.println(arrl);
		
		
		
	}
}