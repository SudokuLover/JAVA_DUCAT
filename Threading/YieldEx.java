class MyThread extends Thread{
	public MyThread(){
	
		//setDeamon(true);
	}
	public void run(){
	
		for(int i=1;i<=10;i++){
			
			System.out.println("Counting"+i);
		}
	
	}
}

public class YieldEx{

	public static void main(String ...s){
		
		MyThread ct = new MyThread();
		
		ct.start();
		
		Thread.yield();
		
		System.out.println("Main");
	
	}

}