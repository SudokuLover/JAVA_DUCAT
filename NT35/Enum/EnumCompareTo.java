enum Week{
	
	MONDAY,TUESDAY,WEDNESDAY,TRUSDAY,FRIDAY,SATURDAY,SUNDAY;
}	
	
public class EnumCompareTo{
	
	
	public static void main(String args[])
	{
		Week day1,day2,day3;
		
		day1=Week.MONDAY;
		day2=Week.TUESDAY;
		day3=Week.FRIDAY;
		
		if(day1.compareTo(day2)<0)
			System.out.println(day1 + " come before "+ day2);
		
		if(day1.compareTo(day3)>0)
			System.out.println(day2 + " come after "+ day3);
		
		if(day2.compareTo(day3)==0)
			System.out.println(day1+ " equals " +day3);
			}
}