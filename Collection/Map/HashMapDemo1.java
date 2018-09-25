import java.util.*;

class HashMapDemo1{
	public static void main(String args[])
	{
		HashMap<Emp,String> hm = new HashMap<>();
		System.out.println(hm.size());
		hm.put(new Emp(10),"aaaa");
		hm.put(new Emp(10),"bbbb");
		hm.put(new Emp(10),"cccc");
		hm.put(new Emp(10),"dddd");
		
		hm.put(new Emp(10),"zzzz");
		Set s = hm.entrySet();
		Iterator<Map.Entry> i = s.iterator();
		while(i.hasNext())
		{
			Map.Entry e = i.next();
			Emp k = (Emp)e.getKey();
			String v = (String)e.getValue();
			System.out.println(k.id+ "  =  "+v);
		}
	}
}

class Emp{
	int id;
	Emp(int id)
	{
		this.id=id;
		//System.out.println(hashCode());
	}
	
	public boolean equals(Object o)
	{
		Emp e = (Emp)o;
		if(e.id==this.id)
			return true;
		return false;
	}
	
	@Override
	public int hashCode()
	{
		//System.out.println(hashCode());
		return id*10;
	}
}