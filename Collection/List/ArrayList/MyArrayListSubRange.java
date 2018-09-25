import java.util.ArrayList;
import java.util.List;

class MyArrayListSubRange {
	
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		//adding element to end
		list.add("First");
		list.add("Second");
		list.add("third");
		list.add("random");
		list.add("click");
		
		System.out.println("Actual ArrayList: "+list);

		List<String> subList = list.subList(2,4);
		
		System.out.println("SubList: "+subList);
		
	}
}