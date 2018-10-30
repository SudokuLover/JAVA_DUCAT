enum Week{
	
	MONDAY,TUESDAY,WEDNESDAY,TRUSDAY,FRIDAY,SATURDAY,SUNDAY;
}	
	
public class EnumValueOf{
	
	
	public static void main(String args[])
	{
		
		Week day;
		
			day=Week.valueOf("MONDAY");
			System.out.println( "Day contains "+ day);
			
			day=Week.valueOf("TUESDAY");
			//day=Week.valueOf("TUEsDAY");
			System.out.println( "Day contains "+ day);
		
	}
}