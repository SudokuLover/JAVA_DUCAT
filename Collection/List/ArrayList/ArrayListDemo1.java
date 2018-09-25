import java.util.*;

class ArrayListDemo1{
	
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		//ArrayList al = new ArrayList();
		System.out.println(al.size());
		
		
		int x[]={1,2,-3,-4,-5,3,4,5,8,9};
		
		for(int i=0;i<x.length;i++)
			al.add(x[i]);
		
		System.out.println(al);
		
		Iterator<Integer> i=al.iterator();
		//Iterator i=al.iterator();
		
		while(i.hasNext())
		{
			//Integer z=(Integer)i.next();
			Integer z=i.next();
			
			if(z.intValue()<0)
				i.remove();
			
		}
		System.out.println(al);
		
	}
	
}