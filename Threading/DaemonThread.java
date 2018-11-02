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
			System.out.println(getName());
		}
		System.out.println(getName()+" dead ");
	}

}

class Thread2 extends Thread{
	
	public static void delay(long x)
	{

		try{
			Thread.sleep(x);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	Thread2(String s)
	{
		super(s);
		//start();
	}
	public void run(){
		for(int i=0;i<10;i++)
		{
			delay(1000);
			System.out.println(getName());
		}
		System.out.println(getName()+" dead ");
	}

}

class Thread3 extends Thread{
	
	public static void delay(long x)
	{

		try{
			Thread.sleep(x);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	Thread3(String s)
	{
		super(s);
		//start();
	}
	public void run(){
		for(int i=0;i<15;i++)
		{
			delay(1000);
			System.out.println(getName());
		}
		System.out.println(getName()+" dead ");
	}

}



class DaemonThread{
	
	public static void main(String args[])
	{
		Thread1 t1= new Thread1("Thread1");
		Thread2 t2= new Thread2("Thread2");
		Thread3 t3= new Thread3("Thread3");
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=1;i<=2;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try{
				
				Thread.sleep(1000);
			}
			catch(Exception e){}

		}
		
			System.out.println(Thread.currentThread().getName()+"  dead");
	}

}