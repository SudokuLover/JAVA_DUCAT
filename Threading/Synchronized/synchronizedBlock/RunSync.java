class Shared {
	int flag=0;
	int data=0;
	
	public static void delay(long x)
	{
		try{
			Thread.sleep(x);
		}
		catch(Exception e){
			System.out.println(e);
		}
	
	}
	synchronized public void submit(){
		
		flag =1;
		delay(1000);
		data=10;
		System.out.println("value submitted");
		notify();
	
	}
	
	synchronized int withdraw(){
		
		if(flag==0)
		{
			try{
				System.out.println("sending into wait");
				wait();
			}
			catch(Exception e)
			{}
		}
		return data;
	}

}

class Thread1 extends Thread{
	
	Shared s;
	Thread1(Shared s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
	public void run(){
		System.out.println(s.withdraw());
	}
	
}

class Thread2 extends Thread{
	
	Shared s;
	Thread2(Shared s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
	public void run(){
		s.submit();
	}
	
}

class RunSync{
	public static void main(String args[])
	{
		Shared st= new Shared();
		Thread1 t1 = new Thread1(st,"one");
		Thread2 t2 = new Thread2(st,"two");
	}
}