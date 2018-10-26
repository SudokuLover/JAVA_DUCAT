import java.io.*;
class Car implements Externalizable{
	static int age;
	String name;
	int year;
	/*mandatory public No argument constructor*/
	public Car(){
		System.out.println("Default");
	}
	Car(String n, int y){
		name=n;
		year=y;
		age=10;
	}
	
	/* mandatory write External method */
	
	public void writeExternal(ObjectOutput out)throws IOException{
		System.out.println("writeExternal");
		out.writeObject(name);
		out.writeInt(year);
		out.writeInt(age);
		
	}
	/*
	 * mandatory readExternal method
	 */
	 public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
		 
		 System.out.println("readExternal");
		 name=(String)in.readObject();
		 year=in.readInt();
		 age=in.readInt();
	 }
	 public String toString(){
		 return ("name= "+name+"\n"+"Year= "+year+"\n"+"Age= "+age);
	 }
}
