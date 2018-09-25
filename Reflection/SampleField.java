//Determining Fields
import java.awt.*;
import java.lang.reflect.*;

public class SampleField{
	
	public static void printFields(Object o)
	{
		Class c = o.getClass();
		Field f[]= c.getFields();
		for(int i=0;i<f.length;i++)
		{
			System.out.println(" ");
			Class type=f[i].getType();
			System.out.print(type.getName());
			System.out.print("  "+f[i].getName());
		}
		
	}
	public static void main(String args[]) throws Exception{
		
		//Color c=new Color(1,1,1);
		
		Temp c=new Temp();
		printFields(c);
		
	}

}

class Temp{
	
	public int x;
	public byte b;
	public long l;
	public short s;
	public boolean b1;
	public char ch;
	public double d;
	 float f;
	
}