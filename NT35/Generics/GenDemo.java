class Gen<T>{
	
	T ob;
	Gen(T ob)
	{
		this.ob=ob;
	}
	
	T getOb(){
		return ob;
	}
	void showType()
	{
		Class c=ob.getClass();
		System.out.println("Type of class T is " + c.getName());
	}
}

public class GenDemo{
	
	public static void main(String ...args){
	
		Gen<Integer> iob=new Gen<Integer>(98);
		iob.showType();
		
		int v=iob.getOb();
		System.out.println("Value " + v);
		System.out.println();
		
		//Gen<String> strob=new Gen<>("Generics Test");
		Gen<String> strob=new Gen<String>("Generics Test");
		strob.showType();
		
		String str=strob.getOb();
		System.out.println("Value " + str);
		System.out.println();
		
		Emp e1 = new Emp();
		
		Gen<Emp> eob=new Gen<Emp>(e1);
		eob.showType();
		
		Emp e=eob.getOb();
		System.out.println("Value " + e1.x);
		System.out.println();
		
		//iob=strob;  //error
		
	}
	
}

class Emp{
	int x=2000;
}