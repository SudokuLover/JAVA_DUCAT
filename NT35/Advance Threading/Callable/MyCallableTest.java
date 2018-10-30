import java.util.concurrent.*;
import java.util.*;


class MyCallable1 implements Callable{
	
	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		//return the name of thread
		return Thread.currentThread().getName();
	}
}

public class MyCallableTest{
	
	public static void main(String args[]){
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		//use collection to store results
		ArrayList<Future<String>> list = new ArrayList<Future<String>>();
		for(int i=0;i<10;i++)
		{
			Future<String> future = executor.submit(new MyCallable1());
			list.add(future);
		}
		//	print result
		
		for(Future<String> future :list	)
		{
			
			try{
				System.out.println(future.get());
			}
			catch(Exception e){
				System.out.println();
			}
			executor.shutdown();
		}
	}
}

