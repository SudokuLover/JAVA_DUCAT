import java.io.*;
public class MyClient1{
	ObjectOutputStream dout;
	public MyClient1(){
		try{
			Emp e1 = new Emp("Nurture",10,2,20,100);
			dout = new ObjectOutputStream(new FileOutputStream("Nurture"));
			dout.writeObject(e1);
			dout.flush();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String args[]){
		new MyClient1();
	
	}		
	
}