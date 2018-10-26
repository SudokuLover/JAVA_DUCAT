import java.io.*;
public class ExternExample{
	public static void main(String s[]){
		//create a car object
		Car car = new Car("mitsubishti",2009);
		Car newCar=null;
		
		//serialize the car
		try{
			FileOutputStream fo = new FileOutputStream("Temp");
			ObjectOutputStream so = new ObjectOutputStream(fo);
			so.writeObject(car);
			so.flush();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		//de-serialize the car
		try{
			FileInputStream fi = new FileInputStream("Temp");
			ObjectInputStream si = new ObjectInputStream(fi);
			newCar=(Car)si.readObject();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("the original car is ");
		System.out.println(car);
		System.out.println("the new car is ");
		System.out.println(newCar);
		
	}
	
	
}