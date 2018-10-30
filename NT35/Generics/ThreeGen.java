class ThreeGen<T,V,lalu>{
	
	T ob1;
	V ob2;
	lalu ob3;
	ThreeGen(T ob1,V ob2 , lalu ob3)
	{
		this.ob1=ob1;
		this.ob2=ob2;
		this.ob3=ob3;
	}
	
	void showType()
	{
		System.out.println("Type of class T is " + ob1.getClass().getName());
		System.out.println("Type of class V is " + ob2.getClass().getName());
		System.out.println("Type of class lal is " + ob3.getClass().getName());
	}
	
	T getOb1(){
		return ob1;
	}
	
	V getOb2(){
		return ob2;
	}
	lalu getOb3(){
		return ob3;
	}
	
	public static void main(String ...args){
	
		ThreeGen<Integer,String,Double> tgobj=new ThreeGen<Integer,String,Double>(88,"Genrices",20.14);
		tgobj.showType();
		
		int t=tgobj.getOb1();
		String v=tgobj.getOb2();
		Double lalu=tgobj.getOb3();
		System.out.println("Value " + v);
		System.out.println("Value " + t);
		System.out.println("Value " + lalu);		
	}
	
}