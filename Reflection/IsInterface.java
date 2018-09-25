//how to identify class,primitive data type,interfaces,arrays
import java.awt.*;
import java.lang.reflect.*;
import java.io.*;

public class IsInterface{
	
		public static void main(String args[]) throws Exception{
		
			Class clazz=int.class;
			Class ar=int[].class;
			Class c=java.io.Serializable.class;
			
			boolean isInterface=clazz.isPrimitive();
			boolean isInterface1=ar.isArray();
			boolean isInterface3=ar.isInterface();
			boolean isInterface2=c.isInterface();
			
			System.out.println("Is Primitive = "+ isInterface);
			System.out.println("Is Array = "+ isInterface1);
			System.out.println("Is Interface = "+ isInterface2);
			System.out.println("Is Interface = "+ isInterface3);
			
	}

}
