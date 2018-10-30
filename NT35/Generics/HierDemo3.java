//Relationship between Generic classes
class Gen<T>{
	T ob;
	Gen(T o)
	{
		ob=o;
	}
	
	//return ob;
	T getOb(){
		return ob;
	}
}

//a sub class of gen
class Gen2<T> extends Gen<T>{
	
	Gen2 (T o)
	{
		super(o);
	}
}

//demonstrate runtime type id implications of generic class hierarchy
public class HierDemo3{
	
	public static void main(String ...args){
	
		//create a Gen Object for Integer
		
		 Gen<Integer> iob1=new Gen<Integer>(88);
		
			//create a Gen2 Object for Integer
			
		 Gen2<Integer> iob2=new Gen2<Integer>(99);
		
		//create a Gen2 Object for String
			
	 Gen2<String> strob2=new Gen2<String>("Generic Test");
	
	 if(iob2 instanceof Gen2<?>)
		 System.out.println("iob2 is instanceof gen2 ");
	
	 if(strob2 instanceof Gen2<?>)
		 System.out.println("strob2 is instanceof gen2 ");
		
		System.out.println();
		
		//see if it iob is an instance of gen2, which it is not
		
		 if(iob1 instanceof Gen2<?>)
			 System.out.println("iob is instanceof gen2 ");
			
		//see if it iob is an instance of gen, which it is 
		
		 if(iob1 instanceof Gen<?>)
			 System.out.println("iob is instanceof gen ");
	
	}
	
}
