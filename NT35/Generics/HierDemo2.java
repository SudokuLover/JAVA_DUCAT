//Relationship between Generic and Non-Generic class
//A non-generic class
class NonGen{
	int num;
	NonGen(int i)
	{
		num=i;
	}
	int getNum(){
		return num;
	}
}

//a generic sub-class
class Gen<T> extends NonGen{
	
	T ob;//declare an object of type T
	//pass the constructor a refrence to an object of Type T
	
	Gen (T o,int i)
	{
		super(i);
		this.ob=o;
	}
	
	T getOb(){
		return ob;
	}
}

//create a Gen Object
public class HierDemo2{
	
	public static void main(String ...args){
	
		//create a Gen Object for String
			
	 Gen<String> w=new Gen<String>("hello",47);
	
		System.out.print(w.getOb()+" ");
		System.out.println(w.getNum());
		
		
	
	}
	
}
