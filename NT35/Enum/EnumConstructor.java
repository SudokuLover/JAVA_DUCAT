enum Apple{
	A(10),B(9),C(12),D(15),E(8);
	
	private int price;//price of each apple
	Apple(int p)
	{
		price=p;
	}
	int getPrice(){
		return price;
	}
}

class EnumConstructor{
	
	public static void main(String args[])
	{
			System.out.println("D cost "+ Apple.D.getPrice()+ " cents\n");
			
			
			System.out.println("All Apple Prices ");
			
			for(Apple a: Apple.values())
			{
				System.out.println(a +" cost "+ a.getPrice()+ " cents");
			}
			
		
	}
}
