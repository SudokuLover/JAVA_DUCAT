import java.awt.*;
import javax.swing.*;

 class ShutDownHooks implements Runnable{
	
	public void run(){
		System.out.println("*** Shutdown Hook Started ***");
		System.out.println("Application Shutdown ");
		try{
			Thread.sleep(1000*5);
		}
		catch(Exception e){
			
		}
	}

}

class RunHookUp{
	
	public static void main(String args[])
	{
		Runtime runtime = Runtime.getRuntime();
		
		ShutDownHooks hook = new ShutDownHooks();
		
		//registering the shutdown hooks
		
		runtime.addShutdownHook(new Thread(hook));
		
		//int x=10/0;
		
		JFrame testFrame = new JFrame("testFrame");
		
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		testFrame.setSize(400,400);
		
		testFrame.setVisible(true);
		
		System.out.println("hello");
		
	}
	
}