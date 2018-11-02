class Shared{
	
	int x,y;
	
	public static void delay(long x){
	
		try{
			Thread.sleep(x);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	
	}	
	
	synchronized void show(String s, int a)
	{
		x=a;
		System.out.println("Starting in method " + s + " " + x);
		delay(1000);
		System.out.println("Exiting from method " + s + " " + x);
		
	}
	
	  synchronized int add(int a,int b){
		x=a;
		y=b;

		//System.out.println(Thread.currentThread().getName());
		delay(1000);
		
		return x+y;
	}

	
	synchronized void show1 (String s,int a)
	{
		System.out.println("Starting with show1 " + s );
		delay(1000);
		System.out.println("Ending with method " + s );
	}
	
	
	 void show2 (String s,int a)
	{
		System.out.println("Starting in this method " + s );
		synchronized(this){
			x=a;
			System.out.println("Starting in block " + s+" "+ x);
			delay(2000);
		}
		System.out.println("Ending in this method " + s + " "+x );
	}
	
	Temp t= new Temp();
	
	void show3 (String s,int a)
	{
		System.out.println("Starting with show3 " + s );
		synchronized(t){
				t.dilTohPagalHai(s);
			}
		System.out.println("Ending in this method " + s + " "+x );
	}
	
	void show4 (String s,int a)
	{
			x=a;
			System.out.println("Starting with show4 " + s+" "+ x);
			
			Thread.currentThread().suspend();
			Thread.currentThread().resume();
		
		System.out.println("Ending with show4 " + s + " "+x );
	}
	
}

class CustomThread extends Thread{
	
	Shared s;
	
	public CustomThread (Shared s, String str)
	{
		super(str);
		this.s=s;
		start();
	}
	
	public void run(){
		//s.show(Thread.currentThread().getName(),10);
		System.out.println("Thread1 sum of 10,20= " + s.add(10,20));
		
	}
}

class CustomThread2 extends Thread{
	
	Shared s;
	
	public CustomThread2 (Shared s, String str)
	{
		super(str);
		this.s=s;
		start();
	}
	
	public void run(){
		//s.show(Thread.currentThread().getName(),20);
		System.out.println("Thread2 sum of 100,200= " + s.add(100,200));
		
	}
}

class CustomThread3 extends Thread{
	
	Shared s;
	
	public CustomThread3 (Shared s, String str)
	{
		super(str);
		this.s=s;
		start();
	}
	
	public void run(){
		//s.show(Thread.currentThread().getName(),30);
		System.out.println("Thread3 sum of 1000,2000= " + s.add(1000,2000));
		
	}
}



class RunSyncWithTemp{
	
	public static void main(String s1[])
	{
		Shared s= new Shared();
		CustomThread t1 = new CustomThread(s,"one");
		CustomThread2 t2 = new CustomThread2(s,"two");
		CustomThread3 t3 = new CustomThread3(s,"three");
	}
	
}



class Temp {
	
	void dilTohPagalHai(String s)
	{
		System.out.println("Starting with dilTohPagalHai " + s );
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("Ending with dilTohPagalHai " + s );
	}
}