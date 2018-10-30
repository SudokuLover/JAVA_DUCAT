class ComparisonPool{
	
	public static void main(String ...args){
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		boolean r=i1==i2;
		System.out.println(r);
		
		Integer i3=128;//127
		Integer i4=128;//127
		
		
		 r=i3==i4;
		//will give true only if value doesn't exceed the range of data type
		System.out.println(r);
	}
	
}