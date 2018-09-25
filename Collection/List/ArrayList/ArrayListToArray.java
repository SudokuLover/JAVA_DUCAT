import java.util.*;
public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> arrayList= new ArrayList<String>();
		arrayList.add("String1");
		arrayList.add("String2");
		arrayList.add("String3");
		arrayList.add("String4");
		
		/*ArrayList to Array conversion*/
		
		String array[]= new String[arrayList.size()];
		
		for(int i=0;i<arrayList.size();i++)
		{
			array[i]=arrayList.get(i);
		}
		
		/*dislaying array elements*/
		
		for(String k:array)
			System.out.println(k);
	}

}
