import java.util.concurrent.*;
public class ConcurrentLinkedQueueExample{
	public static void main(String args[])
	{
		ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
		
		Thread producer = new Thread(new Producer(queue));
		Thread consumer=new Thread(new Consumer(queue));
		
		producer.start();
		consumer.start();
	}
	
}

//producer put()s the string on the queue

class Producer implements Runnable{
	
	ConcurrentLinkedQueue<String> queue;
	
	Producer (ConcurrentLinkedQueue<String> queue)
	{
		this.queue= queue;
	}
	public void run(){
		System.out.println("producer started");
		try{
			for(int i=1;i<=10;i++)
			{
				queue.add("String "+i);
				System.out.println("added string "+i);
				Thread.currentThread().sleep(1000);
			}

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

//Consumer removes the string from the queue
class Consumer implements Runnable{
	
	ConcurrentLinkedQueue<String> queue;
	
	Consumer (ConcurrentLinkedQueue<String> queue)
	{
		this.queue= queue;
	}
	public void run(){
		System.out.println("Consumer started");
		String str;
		for(int x=0;x<10;x++)
		{
			while((str=queue.poll())!=null){
				System.out.println("Removed: "+str);
			}
			try{
			Thread.currentThread().sleep(2000);;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	}
	
	
}