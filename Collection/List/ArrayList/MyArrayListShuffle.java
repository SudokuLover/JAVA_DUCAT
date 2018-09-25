import java.util.ArrayList;
import java.util.Collections;

class MyArrayListShuffle {
	
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("cric");
		list.add("play");
	
		System.out.println("result before shuffle operation");

		for(String str : list)
		{
			System.out.println(str);
		}
		
		Collections.shuffle(list);
		System.out.println("Result after shuffle operations ");
		for(String str : list)
		{
			System.out.println(str);
		}
		
		Collections.shuffle(list);
		
		System.out.println("Result after shuffle operations ");
		for(String str : list)
		{
			System.out.println(str);
		}
				
	}
}