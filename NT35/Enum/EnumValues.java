enum Week{
	
	MONDAY,TUESDAY,WEDNESDAY,TRUSDAY,FRIDAY,SATURDAY,SUNDAY;
}	
	
public class EnumValues{
	
	
	public static void main(String args[])
	{
		System.out.println("here are all week constants");
		//uses values();
		
		Week allWeek[]=Week.values();
		
		for(int i=0;i<allWeek.length;i++)
		{
			System.out.println(allWeek[i]);
		}
		
		for(Week aday:allWeek)
		{
			System.out.println(aday);
		}
	}
}