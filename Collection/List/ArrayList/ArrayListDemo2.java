import java.util.*;

class ArrayListDemo2{
	
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int x[]={1,2,-3,-4,-5,3,4,5,8,9};
		
		for(int i=0;i<x.length;i++)
			al.add(x[i]);
		
		System.out.println(al);
		
		Object o[]=al.toArray();
		
		for(int i=0;i<x.length;i++)
			{
				Integer z=(Integer)o[i];
				System.out.print(z.intValue()+" ");
			}
		System.out.println("");
		
		for(Integer i:al)
		{
			System.out.print(i.intValue()+" ");
		}
		
	}
	
}