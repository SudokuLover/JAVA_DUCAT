import java.util.concurrent.*;
import java.util.*;
public class ExchangerExample{
	public static void main(String args[])
	{
		Exchanger<String> exchanger = new Exchanger<String>();
		
		Thread t1 = new MyThread(exchanger, "I Like Coffee");
		Thread t2 =new MyThread(exchanger, "I Like Tea");
		
		t1.start();
		t2.start();
	}
	
}
class MyThread extends Thread{
	
	Exchanger<String> exchanger;
	String message;
	
	MyThread (Exchanger<String> exchanger,String message)
	{
		this.exchanger= exchanger;
		this.message= message;
	}
	public void run(){		
		try{
			System.out.println(this.getName()+ " message "+ message);
			
			//excahnge message
			
			message = exchanger.exchange(message);
			
			System.out.println(this.getName()+ " message "+ message);
		}
		catch(Exception e){
			e.printStackTrace();
		}
}
	
	
}