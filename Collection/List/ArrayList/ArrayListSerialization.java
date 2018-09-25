import java.io.*;
import java.util.*;

class ArrayListSerialization{
	
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println(al.size());
		
		al.add("hi");
		al.add("hello");
		al.add("howdy");
		
		try{
			FileOutputStream fos = new FileOutputStream("myFile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			fos.close();
			
			System.out.println("after deserialization");
			
			FileInputStream fis = new FileInputStream("myFile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList al1=(ArrayList)ois.readObject();
			System.out.println(al1);
		}
		catch(Exception ioe){
			ioe.printStackTrace();
		}
	}
	
}