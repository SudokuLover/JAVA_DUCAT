import java.lang.reflect.Constructor;

class Temp{
	
	private Temp()
	{
		System.out.println("default constructor");	
	}
	
	private Temp(int x)
	{
		System.out.println(x+" via parameterized default constructor");	
	}
	
	void show(){
		
		System.out.println("show");	
	}
	
}
class PrivateConstructor{
	
	public static void main(String args[]){	
		
		try{
			Class cls=Temp.class;
			Constructor c=cls.getDeclaredConstructor();
			c.setAccessible(true);//solution
			
			Temp t1=(Temp)c.newInstance();
			t1.show();
			
			Constructor c1=cls.getDeclaredConstructor(int.class);
			c1.setAccessible(true);//solution
			
			Temp t2=(Temp)c1.newInstance(10);
			t2.show();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
