import java.lang.reflect.*;
public class Calculator{
	
	public int operatorBinary(int a,int b,IntegerMath op){
		
		return op.operation(a,b);
	}
	
	public static void main(String ...str) throws Exception{
		
		Calculator myApp = new Calculator();
		
		IntegerMath addition = (int a,int b)->a+b;
		IntegerMath subtraction = (a,b)->a-b;
		
		Class c = subtraction.getClass();
		
		if(c.isInterface())
			System.out.println("it is  an interface");
		
		else if(c.isPrimitive())
			System.out.println("it is Primitive");

		else if(c.isArray())
			System.out.println("it is an Array");
		else
			System.out.println("it is a class");

		System.out.println(c.getName());
		
		Class in[]=c.getInterfaces();
		
		for(Class i:in)
			System.out.println(i.getName());
		
		Method m=c.getDeclaredMethod("operation", int.class,int.class);
		
		System.out.println(m.getName());
		
		System.out.println("40  + 2 = " + myApp.operatorBinary(40, 2, addition));
		
		System.out.println("20  + 10 = "+ myApp.operatorBinary(20, 10, subtraction));
		
	}
}

interface IntegerMath{
	
	int operation(int a,int b);
}