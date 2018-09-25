//determine all methods
import java.awt.*;
import java.lang.reflect.*;

public class SampleMethods{
	
	public static void printMethods(Object o)
	{
		Class c = o.getClass();
		Method m[]= c.getMethods();
		for(int i=0;i<m.length;i++)
		{
			System.out.print(m[i].getReturnType().getName());
			System.out.print(" "+m[i].getName());
			System.out.print("(");
			
			Class type[]=m[i].getParameterTypes();
			
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
		
		String s1=new String("hh");
	//	Temp t1= new Temp();
	//can get methods of your class as well
		printMethods(t1);
		
	}

}