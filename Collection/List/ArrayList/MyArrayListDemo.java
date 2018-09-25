import java.util.*;

class MyArrayListDemo {
	
	public static void main(String args[])
	{
		MyArrayList<String> al = new MyArrayList<String>(5);
		//MyArrayList al = new MyArrayList(5);
		
		Iterator i = al.iterator();
		al.add("Ram");
		al.add("Mohan");
		al.add("Sohan");
		al.add("Sita");
		al.add("Geeta");
		
		i.remove();
		al.add("reeta");
		al.add("reeta");
		al.add("reeta");
		
		i.remove();
		
		System.out.println(al.size());
		System.out.println(al.capacity());
		System.out.println(al);
		
		i.remove();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(al.size());
		System.out.println(al.capacity());
		System.out.println(al);
	}
	
}
