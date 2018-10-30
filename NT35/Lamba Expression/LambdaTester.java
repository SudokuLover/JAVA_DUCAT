public class 
{
	
	private int operation(int a,int b , MathOperation op)
	{
		return op.operation(a, b);
	}
	public static void main(String ...str) throws Exception{
		
		LambdaTester tester = new LambdaTester();
		//with return type declaration
		MathOperation addition =  (a,b)->a+b;
		//without return type declaration
		MathOperation subtraction = (a,b)->a-b;
		//with return statement along with the curly braces 
		MathOperation multiplication = (int a,int b)->{
			return a*b;
		};
		
		//without return statement and without the curly braces
		MathOperation division = (int a,int b)->a/b;
				
		System.out.println("10  + 5 = " + tester.operation(10, 5, addition));
		System.out.println("10  - 5 = " + tester.operation(10, 5, subtraction));
		System.out.println("10  * 5 = " + tester.operation(10, 5, multiplication));
		System.out.println("10  / 5 = " + tester.operation(10, 5, division));
		
		GreetingService greetingService1=message->System.out.println("Hello "+message);
		
		GreetingService greetingService2=message->{
			System.out.println("Hello "+message);
			System.out.println("Hey "+message);
		};
		greetingService1.sayMessage("Mahesh");
		greetingService2.sayMessage("Suresh");;
	}
}

interface MathOperation{
	
	int operation(int a,int b);
}

interface GreetingService{
	
	void sayMessage(String message);
}