import java.io.*;

public class MyClient2{
	ObjectOutputStream dout;
	public MyClient2(){
		try{
			Emp e1= new Emp("Nurture",10,5,20,100);
			Emp e2= new Emp("hello!",13,5,200,5);
			
			dout = new ObjectOutputStream(new FileOutputStream("Nurture.txt"));
			dout.writeObject(e1);
			dout.writeObject(e2);
			dout.flush();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String []g){
		new MyClient2();
	}

}