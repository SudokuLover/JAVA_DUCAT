import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class MyCallable implements Callable<String>{
	
	@Override
	public String call() throws Exception {
		
		System.out.println("Thread started "+ new Date());
		Thread.sleep(6000);
		//return the name of thread
		return Thread.currentThread().getName();
	}
	
	public static void main(String args[]){
	
		//use executorservice from executors utility class,ThreadPool size 1
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		//create MyCallable instance
		Callable<String> callable = new MyCallable();
		
		Future<String> future = executor.submit(new MyCallable());
		System.out.println("after");
			
			try{
				System.out.println(future.get()+ " :: "+ new Date());
			}
			catch(Exception e){
				System.out.println();
			}
			//shutdown the executor service now
			executor.shutdown();
		}
	}


