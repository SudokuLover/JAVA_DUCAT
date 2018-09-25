import java.util.*;
import java.util.Map.Entry;

class HashMapSyncExample{
	public static void main(String args[])
	{
		Map map = Collections.synchronizedMap(new HashMap<Integer,String>());

		map.put(12,"anil");
		map.put(92,"anuj");
		map.put(38,"vijay");

		Set set = map.entrySet();
		synchronized(set)
		{
			Iterator i = set.iterator();
			//display elements
			while(i.hasNext())
			{
				Map.Entry me = (Map.Entry) i.next();
				System.out.print(me.getKey()+":");
				System.out.println(me.getValue());
				
			}
		}
	}
	
}