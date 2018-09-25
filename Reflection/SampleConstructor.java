//determining constructor via reflection
import java.awt.*;
import java.lang.reflect.*;

public class SampleConstructor{
	
	public static void printConstructor(Object o)
	{
		Class c = o.getClass();
		Constructor is[]= c.getConstructors();
		for(int i=0;i<is.length;i++)
		{
			System.out.print(c.getName()+"( ");
			Class type[]=is[i].getParameterTypes();
	
			for(int j=0;j<type.length;j++)
			{
				System.out.print(type[j].getName()+",");
			}
			
			System.out.print(")");
			System.out.println(" ");
		}
		
	}
	public static void main(String args[]) throws Exception{
		
		Thread t=new Thread("ss");
		
		//String s1=new String("hh");
		printConstructor(t);
		
	}

}