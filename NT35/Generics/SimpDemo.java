class TwoGen<T,V>{
	
	T ob1;
	V ob2;
	TwoGen(T ob1,V ob2)
	{
		this.ob1=ob1;
		this.ob2=ob2;
	}
	
	void showType()
	{
		System.out.println("Type of class T is " + ob1.getClass().getName());
		System.out.println("Type of class V is " + ob2.getClass().getName());
	}
	
	T getOb1(){
		return ob1;
	}
	
	V getOb2(){
		return ob2;
	}
}

public class SimpDemo{
	
	public static void main(String ...args){
	
		TwoGen<Integer,String> tgobj=new TwoGen<Integer,String>(88,"Genrices");
		tgobj.showType();
		
		int t=tgobj.getOb1();
		String v=tgobj.getOb2();
		System.out.println("Value " + v);
		System.out.println("Value " + t);
				
	}
	
}