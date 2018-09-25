//Determine packages
import java.awt.*;
import java.lang.reflect.*;

public class SamplePackage{
	
	public static void printPackage(Object o)
	{
		Class c = o.getClass();
		Package pk= c.getPackage();
		System.out.println(pk.getName());
	
		
	}
	public static void main(String args[]) throws Exception{
		
		//Thread t=new Thread("ss");
		
		String s1=new String("ss");
		printPackage(s1);
		
	}

}