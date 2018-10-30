class Vargs2{

	
	void show(int ...x)
	{
		for(int i:x)
			System.out.println(i);
	}
	
	void show(int z)
	{
		System.out.println("single"+z);		
	}
	
	public static void main(String args[]){
		
		new Vargs2().show(new int[]{10,20,30});
		System.out.println("after second call");		
		new Vargs2().show(30);
	}
	
}