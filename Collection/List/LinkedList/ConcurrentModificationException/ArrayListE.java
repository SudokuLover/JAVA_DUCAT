import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListE
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		
		try{
			ArrayListTh1 alt1 = new ArrayListTh1(al);
			Thread tt1 = new Thread(alt1);
			ArrayListTh2 alt2 = new ArrayListTh2(al);
			Thread tt2 = new Thread(alt2);
			
			tt1.setPriority(10);
			tt1.start();
			tt2.start();
			tt1.join();
			tt2.join();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in reading :"+ e);
		}
	
	}
}

class ArrayListTh1 implements Runnable{
	
	ArrayList<String> al;
	
	ArrayListTh1(ArrayList<String> al)
	{
		this.al=al;
	}
	
	public void run()
	{
		Iterator i1=al.iterator();
		while(i1.hasNext())
		{
			try{
				String str = (String)i1.next();
				System.out.println("name : " + str);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Exception in reading :"+ e);
				System.exit(0);
			}
		}
	}
	
}
class ArrayListTh2 implements Runnable{
	
	ArrayList<String> al;
	
	ArrayListTh2(ArrayList<String> al)
	{
		this.al=al;
	}
	
	public void run()
	{
		
			try{
				for(int i=0;i<5;i++){
					al.add("first");
					al.add("second");
					Thread.sleep(1000);
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception in reading :"+ e);
			}
		}
	}
	
