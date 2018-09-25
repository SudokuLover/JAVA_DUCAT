//use class Class object to print all super classes of a class
import java.awt.*;
import java.lang.reflect.*;
import java.io.*;

public class SampleSuper{
	
	public static void printSuperClass(Object o)
	{
		Class subClass = o.getClass();
		System.out.println(subClass.getName());
		Class superClass = subClass.getSuperclass();
		
		while(superClass!=null)
		{
			System.out.println(superClass.getName());
			superClass=superClass.getSuperclass();
			
		}
		
	}
		public static void main(String args[]) throws Exception{
		
			Frame f=new Frame("reflectionTime");
			printSuperClass(f);
		
	}

}
