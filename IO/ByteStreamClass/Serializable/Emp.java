import java.io.*;
public class Emp extends Base implements Serializable {
	//private stastic final long serialVersionUID = 1L;
	transient int a;
	static int b;
	//static int b=40;
	String name;
	int age;
	//int salary;
	//Base b1= new Base();
	Emp(String name , int age, int a, int b,int z){
		this.name=name;
		this.age=age;
		this.a=a;
		this.b=b;
		this.z=z;
		
	}
	
	
	
}
