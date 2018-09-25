import java.util.ArrayList;
import java.util.Collections;

class MyArrayListSwap {
	
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("cric");
		list.add("play");
		list.add("watch");
		list.add("glass");
		list.add("movie");
		list.add("girl");
		
		System.out.println(list);

		Collections.swap(list, 2, 5);
		
		
		System.out.println("Results after swap operation: ");
		
		for(String str:list)
		{
			System.out.println(str);
		}
		
	}
}