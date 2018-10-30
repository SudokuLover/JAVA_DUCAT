import java.util.concurrent.*;
public class BlockingQueueExample{
	public static void main(String args[])
	{
		BlockingQueue queue = new ArrayBlockingQueue(5);
		
		Producer producer = new Producer(queue);
		Consumer consumer=new Consumer(queue);
		
		System.out.println("Starting Producer");
		new Thread(producer).start();
		System.out.println("Starting consumer");
		new Thread(consumer).start();
	}
	
}

//producer class-> it sleeps 3sec b/w each put() call
//this will cause the consumer to block ,while waiting for objects in the queue

class Producer implements Runnable{
	
	protected BlockingQueue queue=null;
	
	public Producer (BlockingQueue queue)
	{
		this.queue= queue;
	}
	public void run(){
		try{
			
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

//Consumer class-> it takes out the object from the queue
//and prints that to system.out

class Consumer implements Runnable{
	
protected BlockingQueue queue=null;
	
	public Consumer (BlockingQueue queue)
	{
		this.queue= queue;
	}
	public void run(){
		try{
			
			queue.put("String One");
			Thread.sleep(3000);
			queue.put("String Two");
			Thread.sleep(3000);
			queue.put("String Three");
			Thread.sleep(3000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}