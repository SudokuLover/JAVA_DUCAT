import java.util.ArrayList;
import java.util.List;

class MyElementCheck {
	
	public static void main(String args[])
	{
		ArrayList<String> arrl = new ArrayList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("third");
		arrl.add("random");
		
		List<String> list =new ArrayList();
		
		list.add("First");
		list.add("Second");
		
		System.out.println("does al contains all list element ?:" + arrl.containsAll(list));
		
		list.add("one");		
		
		System.out.println("does al contains all list element ?:" + arrl.containsAll(list));
		
	}
}