import java.util.concurrent.locks.ReentrantLock;

class TechLeads extends Thread{
	ReentrantLock question_paper;
	String name;
	
	TechLeads(ReentrantLock question_paper,String name)
	{
		super(name);
		this.question_paper = question_paper;
	}
	
	public void run(){
		System.out.println(getName()+" is way for question_paper");
		question_paper.lock();
		System.out.println(getName()+" take the question_paper");
		System.out.println(getName()+" start testing test");
		
		try{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(getName()+" is Interrupted");
		}
		
		System.out.println(getName()+" has taken the test");
		System.out.println(getName()+" return the question paper");
		
		question_paper.unlock();
	}
	
}

class Main_HR{
	
	public static void main(String args[]){
		ReentrantLock question_paper = new ReentrantLock();
		
		new TechLeads(question_paper,"lalu ").start();
		new TechLeads(question_paper,"mullayam ").start();
		new TechLeads(question_paper,"nitish ").start();
		
		System.out.println("hr complete his work");
		
	}
}