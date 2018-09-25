import java.io.*;
import java.util.*;

class ArrayListSerialization1{
	
	public static void main(String args[])
	{
		ArrayList<Emp> al = new ArrayList<Emp>();
		
		System.out.println(al.size());
		
		al.add(new Emp(10));
		al.add(new Emp(20));
		al.add(new Emp(30));
		
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
			
			Iterator<Emp> i = al1.iterator();
			while(i.hasNext())
			{
				Emp e = i.next();
				System.out.println(e.x);
			}
		
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
}

class Emp implements Serializable{
	int x;
	Emp(int x)
	{
		this.x=x;
	}
}