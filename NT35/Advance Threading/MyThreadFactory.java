import java.util.concurrent.*;

public class MyThreadFactory implements ThreadFactory{
	public Thread newThread(Runnable r){
		return new Thread(r);
	}
	public static void main(String args[])
	{
		MyThreadFactory mtf = new MyThreadFactory();
		Thread t1 = mtf.newThread(new MyThread());
		t1.start();
	}
	
}
class MyThread implements Runnable{
	public void run(){
		System.out.println("Inside : "+ Thread.currentThread().getName());
	}
	
}