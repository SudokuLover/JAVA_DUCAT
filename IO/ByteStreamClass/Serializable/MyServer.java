//bees saal baad
import java.io.*;

public class MyServer{
	ObjectInputStream dis;
	public MyServer(){
		try{
			dis = new ObjectInputStream(new FileInputStream("Nurture"));
			Emp z = (Emp)dis.readObject();
			System.out.println("name= "+z.name);
			System.out.println("age= "+z.age);
			System.out.println("a= "+z.a);
			System.out.println("b= "+z.b);
			System.out.println("z= "+z.z);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
	}
	public static void main(String... args){
		new MyServer();
	
	}
	
	
}