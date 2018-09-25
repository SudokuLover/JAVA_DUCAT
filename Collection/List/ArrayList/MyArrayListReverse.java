import java.util.ArrayList;
import java.util.Collections;

class MyArrayListReverse {
	
	public static void main(String args[])
	{
		ArrayList<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(1001));
		list.add(new Emp(1002));
		list.add(new Emp(1003));
		list.add(new Emp(1004));
	
		System.out.println("Actual List: ");

		for(Emp e : list)
		{
			System.out.println(e.id);
		}
		
		Collections.reverse(list);
		System.out.println("Result after reverse operations ");

		for(Emp e : list)
		{
			System.out.println(e.id);
		}
		
	}
}

class Emp{
	int id;
	Emp(int id)
	{
		this.id=id;
	}
	
}