//get info via loading of class
import java.awt.*;
import java.lang.reflect.*;

public class SampleName{
	
	public static void printName(Object o)
	{
		Class c = o.getClass();
		System.out.println(c.getName());
	}
	public static void printName(String s)
	{
		try{
			Class c = Class.forName(s);
			System.out.println(c.getName());
			StringBuffer sb =(StringBuffer)c.newInstance();
			
			System.out.println(sb.length());
			System.out.println(sb.capacity());
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void printName1(String s)
	{
		try{
			Class c = Class.forName(s);
			System.out.println(c.getName());
			Temp sb =(Temp)c.newInstance();
			
			sb.show();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String args[]) throws Exception{
		
		Button b = new Button("jb");
		printName(b);
		printName("java.lang.StringBuffer");
		//printName("java.awt.Frame");
		printName1("Temp");
		
		Class c = java.lang.Thread.class;
		System.out.println(c.getName());
		
		
	}

}

class Temp{
	
	Temp()//Temp(int x)
	{
		System.out.println("instanstiated via default constructor");	
	}
	
	public void show(){
		
		System.out.println("creation of object via reflection");	
	}
	
}