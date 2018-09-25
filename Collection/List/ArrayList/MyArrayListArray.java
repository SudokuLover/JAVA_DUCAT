import java.util.ArrayList;

class MyArrayListArray {
	
	public static void main(String args[])
	{
		ArrayList<String> arrl = new ArrayList<String>();
		
		arrl.add("First");
		arrl.add("Second");
		arrl.add("third");
		arrl.add("random");
	
		System.out.println("Actual ArrayList: "+arrl);
		
		String []strArray = new String[arrl.size()];
		
		arrl.toArray(strArray);
		
		System.out.println("created array content");
		for(String str : strArray)
			{
				System.out.println(str);
			}
	}
}