public class ThreadJoinExample{
	
	public static void main(String args[])
	{
		Thread t1 = new Thread(new MyRunnable(),"t1");
		Thread t2 = new Thread(new MyRunnable(),"t2");
		Thread t3 = new Thread(new MyRunnable(),"t3");
		
		t1.start();
		//starts second thread after waiting for 2 seconds 
		
		try{
			t1.join(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		t2.start();
		
		//starts Thread third only when first Thread is dead
		
		try{
			t1.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		t3.start();
		
		//lets all thread finish execution before finishing main thread
		
		try{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("All threads are dead , exiting main threading");
	}
	
}

class MyRunnable implements Runnable{
	
	public void run(){
			System.out.println("Thread Started:: "+Thread.currentThread().getName());
		try{
				Thread.sleep(4000);
			}
			catch(Exception e){
					System.out.println(e);
			}
			System.out.println("Thread ended "+Thread.currentThread().getName());
	}
}