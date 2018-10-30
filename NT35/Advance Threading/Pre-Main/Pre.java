import java.lang.instrument.*;
class Pre{
	
	public static void premain(String s1,Instrumentation inst)
	{
		System.out.println("This is Pre-Main");
		A a1= new A();
		long l = inst.getObjectSize(a1);
		System.out.println(l);
	}
	
	public static void main(String s)
	{
		System.out.println("This is Main of Pre");
	}
}