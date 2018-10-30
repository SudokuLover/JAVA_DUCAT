class Temp{
	
	
	void show(int ...x)
	{
		for(int i:x)
			System.out.println(i);
	}
	
	public static void main(String args[]){
		
		Temp t=new Temp();
		
		t.show();
		t.show(10);
		t.show(10,20);
		t.show(new int[]{10,20,30});
	}
	
}