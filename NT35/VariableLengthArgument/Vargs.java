class Vargs{
	
	
	void show(char ch,int ...x)
	{
		System.out.println(ch);
		for(int i:x)
			System.out.println(i);
	}
	
	public static void main(String args[]){
		
		new Vargs().show('a',new int[]{10,20,30});
	}
	
}