enum Week{
	
	MONDAY,TUESDAY,WEDNESDAY,TRUSDAY,FRIDAY,SATURDAY,SUNDAY;
}	
	
public class DefaultValue{
	
	
	public static void main(String args[])
	{
		//obtain all ordinal values using ordinal()
		System.out.println("here are all week constants"+ " and their ordinal values : ");
		
		Week day1[]=Week.values();
		
		for(int i=0;i<day1.length;i++)
		{
			System.out.println(day1[i] + " = "+ day1[i].ordinal());
		}
		
		for(Week day:Week.values())
		{
			System.out.println(day + " = "+ day.ordinal());
		}
	}
}