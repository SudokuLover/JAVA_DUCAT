//variable of methods are generic
class GenMethDemo{
	
	//determine if an object is in an array
	static <T,V extends T> boolean isIn(T x,V[] y){
		
		for(int i=0;i<y.length;i++)
		{
			if(x.equals(y[i]))
				return true;
		}
		return false;
	}
static <T extends Number> double add(T x,T y){
		
		double d= x.doubleValue()+y.doubleValue();
		return d;
	}

	public static void main(String ...args){
	
		//use isIn{} on Integer
		
		Integer nums[]={1,2,3,4,5};
		
		if(isIn(2,nums))
			System.out.println("2 is in nums");
	
		if(!isIn(7,nums))
			System.out.println("7 is not in nums");
	
		System.out.println();
	
		//use isIn() on String
		
	String strs[]={"one","two","three","four","five"};
		
		if(isIn("two",strs))
			System.out.println("two is in nums");
	
		if(!isIn("seven",strs))
			System.out.println("seven is not in nums");
	
		System.out.println(add(10,20));
		System.out.println(add(10.5f,20.5f));
		System.out.println(add(10.5,20.5));
		System.out.println(add(100l,200l));
		
		
	
	}
	
}
