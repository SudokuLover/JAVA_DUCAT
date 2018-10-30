import java.util.concurrent.CyclicBarrier;

public class HRM{
	
	public static void main(String args[]){
		
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		
		TechLead techLead1 = new TechLead(cyclicBarrier,"Sachin");
		TechLead techLead2 = new TechLead(cyclicBarrier,"Amit");
		TechLead techLead3 = new TechLead(cyclicBarrier,"Suresh");
		
		techLead1.start();
		techLead2.start();
		techLead3.start();
		
		System.out.println("No work for HR");
	}
	
}


class TechLead extends Thread{
	
	CyclicBarrier cyclicBarrier;
	public TechLead(CyclicBarrier cyclicBarrier,String name)
	{
		super(name);
		this.cyclicBarrier= cyclicBarrier;
	}
	@Override
	public void run(){
		try{
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" recruited developer ");
			System.out.println(Thread.currentThread().getName()+" Waiting for other to complete ");
			cyclicBarrier.await();
			System.out.println(" All finished recruiting "+Thread.currentThread().getName()+" give offer letter to candidate ");
			
		}
		catch(InterruptedException e)
		{
			System.out.println();
			e.printStackTrace();
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println();
			e.printStackTrace();
			System.out.println();
		}		
	}
	
}