class Temp implements Cloneable{
	int g;
	Temp(int g){
		this.g=g;
	}
	public Temp clone(){
		try{
			return (Temp)super.clone();
		}catch(Exception e)
		{
			return null;
		}
	}
}
class DeepMyClone implements Cloneable{
	int x=10;
	Temp t;
	
	public DeepMyClone(int a){
		t=new Temp(a);
	}
	
	public DeepMyClone clone(){
		//Deep Copy
		
		try{
			DeepMyClone d=(DeepMyClone)super.clone();
			d.t=t.clone();
			return d;
		}
		catch(CloneNotSupportedException e){
			return null;
		}
		
	}
	
	public static void main(String s[]){
		DeepMyClone c= null;
		DeepMyClone m=new DeepMyClone(100);
		
		System.out.println("m.t.g ="+m.t.g);
		System.out.println("m.x ="+m.x);
		
		try{
			c=m.clone();
			//c.t=m.t.clone()
		}
		catch(Exception e){}
			System.out.println("c ="+c.t.g);
			System.out.println("c.x ="+c.x);
				
			c.t.g=3000;
			c.x=30;
			
			System.out.println("m after changes in c ="+m.t.g);
			System.out.println("m  after changes in c ="+m.x);
			
			if(m.t!=c.t)
			{
				System.out.println("Deep Clonning");
			}
		
	}
}