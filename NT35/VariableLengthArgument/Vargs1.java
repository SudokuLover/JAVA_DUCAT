class Vargs1{

	
	static void show(Object ...x)
	{
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+" ");
		
		System.out.println(" ");
	}
	
	public static void main(String args[]){
		
		int day=1;
		String month="June";
		int year = 2018;
		
		show(); //new Object[]{}
		show(day);//new Object[]{new Integer(day)}
		show(day,month);//new Object[]{new Integer(day),month}
		show(day,month,year);//new Object[]{new Integer(day),month,new Integer(year)}
		
		Object dateInfo[]={day,month,year};
		show(dateInfo);
		show((Object)dateInfo); //new Object[]{(Object)dateInfo}
		
		
		show(new Object[]{dateInfo});
	
	}
	
}