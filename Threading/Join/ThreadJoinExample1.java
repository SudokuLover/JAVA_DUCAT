import java.util.Date;

class RunnableJob implements Runnable{
	
	public void run(){
			Thread thread = Thread.currentThread();
	
		System.out.println("Runnable Job is being run by "+thread.getName()+" at "+new Date());
		
		try{
				Thread.sleep(1000);
			}
			catch(Exception e){
					System.out.println(e);
			}
	}
}


public class ThreadJoinExample1{
	
	public static void main(String args[]) throws InterruptedException
	{
		RunnableJob runnableJob = new RunnableJob();
		
		Thread thread1 = new Thread(runnableJob,"t1");
		Thread thread2 = new Thread(runnableJob,"t2");
		Thread thread3 = new Thread(runnableJob,"t3");
		Thread thread4 = new Thread(runnableJob,"t4");
		
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		thread3.start();
		thread3.join();
		thread4.start();
		thread4.join();
		
		
		Thread thread5 = new Thread(runnableJob,"t5");
		Thread thread6 = new Thread(runnableJob,"t6");
		Thread thread7 = new Thread(runnableJob,"t7");
		Thread thread8 = new Thread(runnableJob,"t8");
		
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		
		
		System.out.println("All threads are dead , exiting main threading");
	}
	
}
