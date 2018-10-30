class Gen<T extends Number>{
	
	T ob;
	T vals[];
	Gen(T o,T[]nums)
	{
		ob=o;
		vals=nums;
	}
	
}
public class GenArrays{
	public static void main(String ...args){
	
		Integer n[]={1,2,3,4,5};

		Gen<Integer> iob=new Gen<>(50,n);
		
		//can't create an array of type specific generic refrences
		//Gen<Integer> gens[]=new Gen<Integer>[10];
		
		Gen<?> gens[]=new Gen<?>[2]; // ok
		
		gens[0]=new Gen<Integer>(10,n);
		System.out.println(gens[0].ob);
	
		gens[1]=new Gen<Float>(2.3f,new Float[]{1.2f,1.25f});
		System.out.println(gens[1].ob);

		for(int i=0;i<gens[0].vals.length;i++)
		{
			System.out.println(gens[0].vals[i]);
		}
		
		for(int i=0;i<gens[1].vals.length;i++)
		{
			System.out.println(gens[1].vals[i]);
		}
		
	}
	
}
