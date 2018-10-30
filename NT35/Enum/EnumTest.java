enum Day{
	
	MONDAY,TUESDAY,WEDNESDAY,TRUSDAY,FRIDAY,SATURDAY,SUNDAY;
}	
	
public class EnumTest{
	
	Day day;
	
	public EnumTest(Day day){
		this.day=day;
	}
	
	public void tell(){
		switch(day){
		case MONDAY:System.out.println("mondays are bad"); 
					break;
					
		case FRIDAY:System.out.println("fridays are better"); 
					break;
					
		case SATURDAY:
		case SUNDAY:System.out.println("weekends are best"); 
					break;
					
		default:System.out.println("mid-week days are so-so"); 
				break;
		}
	}
		
	public static void main(String args[])
	{
		EnumTest firstDay=new EnumTest(Day.MONDAY);
		firstDay.tell();
		
		EnumTest thirdDay=new EnumTest(Day.WEDNESDAY);
		thirdDay.tell();
		
		EnumTest fifthDay=new EnumTest(Day.FRIDAY);
		fifthDay.tell();
		
		EnumTest sixthDay=new EnumTest(Day.SATURDAY);
		sixthDay.tell();
		
		EnumTest seventhDay=new EnumTest(Day.SUNDAY);
		seventhDay.tell();
		
	}
}