import java.util.*;
import javax.swing.JFrame;
class Task extends TimerTask{
	
	int count;
	
	public void run(){
			
		if(count==10)
			System.exit(0);
		JFrame f= new JFrame();
		
		f.setSize(250,250);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		count++;
		
	}
	
}

class TaskScheduling{
	public static void main(String s[]){
		
		int delay=5000;
		int period=1000;
		
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new Task(),delay,period);
	}
}