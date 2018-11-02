class Thread1 extends Thread{
	
	Thread1(String s)
	{
		super(s);
	}
	public void run(){
		System.out.println(getName());
		
		try{
			Thread.sleep(60000*10);
		}
		catch(Exception e )
		{
			System.out.println("Interrupted successfuly "+ e);	
		}
		
		System.out.println(getName()+" dead ");
		
	}
	
}

class Thread2 extends Thread{
	
	Thread1  t;
	
	Thread2(String s , Thread1 t)
	{
		super(s);
		
		this.t=t;
	}
	public void run(){
		System.out.println(getName());
		t.interrupt();
		try{
			Thread.sleep(1000);
		}
		catch(Exception e )
		{
			
		}
		
		System.out.println(getName()+" dead ");
		
	}
	
}

class Interrupt {
	
	public static void main(String args[]){

		Thread1 t1 = new Thread1("Thread1");
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		Thread2 t2 = new Thread2("Thread2",t1);
		t1.start();
		t2.start();
	}
	
}