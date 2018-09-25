import java.awt.*;
import java.lang.reflect.*;
import java.io.*;

public class SampleInterface{
	
	public static void printInterface(Object o)
	{
		Class c = o.getClass();
		Class []inter = c.getInterfaces();
		
		for(int i=0;i<inter.length;i++)
		{
			System.out.println(inter[i].getName());
			if(inter[i].getName().equals("java.io.Serializable"))
			{
				System.out.println("My class parent interface is seriaziable");
			}
		}
		
	}
		public static void main(String args[]) throws Exception{
		
			t t1= new t();
			printInterface(t1);
		
	}

}

interface a1{}
interface a2{}
interface a3{}
class t extends Frame implements a1,a2,a3,Serializable{}
//for getting parent class, need different way 
