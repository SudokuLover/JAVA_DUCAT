import java.util.*;

class MyPushPopOprs{
	
	public static void main(String args[])
	{
		
		LinkedList<String> arrl = new LinkedList<String>();
	
		arrl.add("First");
		arrl.add("second");
		arrl.add("third");
		arrl.add("random");
		
		System.out.println(arrl);
		
		arrl.push("push elemnt");
		
		System.out.println("after push operation:\n"+arrl);
		arrl.pop();
		System.out.println("after pop operation:\n"+arrl);
		
		
	}
}