//accessing private methods of a class via reflection
import java.lang.reflect.Method;

 class GetMethods{
	
	private double div(int number1,int number2){
		
		return number1/number2;
		
	}
	
}
class Main{
	
	public static void main(String args[]) throws Exception{	
		
		GetMethods m1=new GetMethods();
		Class clazz=m1.getClass();
	
		//Method method=clazz.getDeclaredMethod("div",new Class[]{int.class,int.class});	
		Method method=clazz.getDeclaredMethod("div",int.class,int.class);
		method.setAccessible(true);
		System.out.println("method name = "+method.getName());
		Double z=(Double)method.invoke(m1, 10,5);
		System.out.println(z.doubleValue());
	}

}

