//bees saal baad
import java.io.*;

public class MyServer1{
	ObjectInputStream dis;
	public MyServer1(){
		try{
			dis = new ObjectInputStream(new FileInputStream("Nurture"));
			Emp z1 = (Emp)dis.readObject();
			System.out.println("name= "+z1.name);
			System.out.println("age= "+z1.age);
			System.out.println("a= "+z1.a);
			System.out.println("b= "+z1.b);
			System.out.println("z= "+z1.z);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
	}
	public static void main(String... args){
		new MyServer1();
	
	}
	
	
}