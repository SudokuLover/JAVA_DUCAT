class Thread1 extends Thread{
	
	public static void delay(long x)
	{

		try{
			Thread.sleep(x);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	Thread1(String s)
	{
		super(s);
		//start();
	}
	public void run(){
		for(int i=0;i<5;i++)
		{
			delay(1000);
			//System.out.println(Thread.currentThread().getName());
			System.out.println(getName());
		}
		System.out.println(getName()+" dead ");
	}

}


class OneClassMObjects{
	
	
	public static void main(String args[]){
		
		Thread1 t1= new Thread1("Thread1");
		Thread1 t2= new Thread1("Thread2");
		Thread1 t3= new Thread1("Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				
			}
		
		}
		
			System.out.println("dead "+Thread.currentThread().getName());
	}
	
}