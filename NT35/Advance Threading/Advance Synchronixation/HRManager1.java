import java.util.concurrent.Semaphore;

public class HRManager1{
	
	public static void main(String args[]){
		
		Semaphore questionPaperPool = new Semaphore(2);
		
		TechLead techLead1 = new TechLead(questionPaperPool,"Sachin TL");
		TechLead techLead2 = new TechLead(questionPaperPool,"Amit TL");
		TechLead techLead3 = new TechLead(questionPaperPool,"Suresh TL");
		TechLead techLead4 = new TechLead(questionPaperPool,"Ramesh TL");
		
		techLead1.start();
		techLead2.start();
		techLead3.start();
		techLead4.start();
		
		System.out.println("No work for HR");
	}
	
}


class TechLead extends Thread{
	
	Semaphore questionPaperPool;
	public TechLead(Semaphore questionPaperPool,String name)
	{
		super(name);
		this.questionPaperPool= questionPaperPool;
	}
	@Override
	public void run(){
		try{
			System.out.println(Thread.currentThread().getName()+" waiting for Test question paper ");
			//acquire question paper
			questionPaperPool.acquire();
			System.out.println(Thread.currentThread().getName()+" Conducting Test ");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" Test done  give back the paper ");
			
			//giving back to acquired question paper
			questionPaperPool.release();
		}
		catch(InterruptedException e)
		{
			System.out.println();
			e.printStackTrace();
			System.out.println();
		}
	}
	
}