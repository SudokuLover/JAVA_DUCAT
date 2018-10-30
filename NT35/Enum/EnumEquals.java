enum Week{
	
	MONDAY,TUESDAY,WEDNESDAY,TRUSDAY,FRIDAY,SATURDAY,SUNDAY;
}	
	
public class EnumEquals{
	
	
	public static void main(String args[])
	{
		Week day1,day2,day3;
		
		day1=Week.MONDAY;
		day2=Week.MONDAY;
		day3=Week.TUESDAY;
		
		if(day1.equals(day2))
			System.out.println("Error!");
		
		if(!day1.equals(day3))
			System.out.println(day1 + " Not Equal " + day3);
		
		if(day2!=day3)
			System.out.println(day2+ " != " +day3);
			}
}