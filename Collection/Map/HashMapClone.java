import java.util.*;

class HashMapClone{
	public static void main(String args[])
	{
		HashMap hashMap = new HashMap();

		hashMap.put(1,"one");
		hashMap.put(2,"two");
		hashMap.put(3,"three");

		System.out.println("original Hashmap:"+hashMap);
		
		HashMap hashMap1=(HashMap)hashMap.clone();
		
		System.out.println("copied Hashmap:"+hashMap1);
		
	}
	
}