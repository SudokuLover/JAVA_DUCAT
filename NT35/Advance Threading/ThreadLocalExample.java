public class ThreadLocalExample{
	
	static int x=10;
	public static class MyRunnable implements Runnable{
		
		private  ThreadLocal<Integer> threadLocal =new ThreadLocal<Integer>();
		@Override
		public void run(){
			int z=(int)(Math.random()*1000);
			
			System.out.println(Thread.currentThread().getName()+ "  "+ z);
			threadLocal.set(z);
			//threadLocal.set(x++);
			
			try{
				Thread.sleep(2000);
			}
			catch(Exception e){
				
			}
			System.out.println(Thread.currentThread().getName() +"  "+ threadLocal.get());
		}
	}
	
	public static void main(String args[]){
		
		MyRunnable sharedRunnableInstance = new MyRunnable();
		
		Thread thread1 = new Thread(sharedRunnableInstance);
		Thread thread2 = new Thread(sharedRunnableInstance);
		Thread thread3 = new Thread(sharedRunnableInstance);
		Thread thread4 = new Thread(sharedRunnableInstance);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		/*thread1.start();
			get an exception illegal thread state exception
		 as thread1 is still alive
		*/
	}
	
}