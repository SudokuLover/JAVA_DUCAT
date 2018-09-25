import java.util.*;

class HashMapDemo2{
	public static void main(String args[])
	{
		HashMap<Emp,String> hm = new HashMap<>();
		System.out.println(hm.size());
		System.out.println("is HashMap Empty?"+ hm.isEmpty());
		hm.put(new Emp(10),"aaaa");
		hm.put(new Emp(20),"bbbb");
		hm.put(new Emp(30),"cccc");
		hm.put(new Emp(40),"dddd");
		Set s = hm.entrySet();
		Iterator<Map.Entry> i = s.iterator();
		while(i.hasNext())
		{
			Map.Entry e = i.next();
			Emp k = (Emp)e.getKey();
			String v = (String)e.getValue();
			System.out.println(k.id+ "  =  "+v);
		}
		Emp e= new Emp(40);
		String ss=hm.get(e);
		System.out.println(ss);
		
		hm.remove(e);
		
		 s = hm.entrySet();
		 i = s.iterator();
		while(i.hasNext())
		{
			Map.Entry e1 = i.next();
			Emp k = (Emp)e1.getKey();
			String v = (String)e1.getValue();
			System.out.println(k.id+ "  =  "+v);
		}
		hm.clear();
		System.out.println("is HashMap Empty?"+ hm.isEmpty());
	}
}

class Emp{
	int id;
	Emp(int id)
	{
		this.id=id;
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
	{	return id*10;
	}
}