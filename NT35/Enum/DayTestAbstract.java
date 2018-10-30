enum Day{
	
	MONDAY(1){
		public Day next(){return TUESDAY;}
		//each instance provide its implementation to abstract method
	},
	
	TUESDAY(2){
		public Day next(){return WEDNESDAY;}
		
	},
	WEDNESDAY(3){
		public Day next(){return TRUSDAY;}
		
	},
	TRUSDAY(4){
		public Day next(){return FRIDAY;}
		
	},
	FRIDAY(5){
		public Day next(){return SATURDAY;}
		
	},
	SATURDAY(6){
		public Day next(){return SUNDAY;}
		
	},
	SUNDAY(7){
		public Day next(){return MONDAY;}
		
	};
	
	public abstract Day next();
	private final int dayNumber;
	
	Day(int Number)
	{
		dayNumber = Number;
	}
	int getDayNumber(){
		return dayNumber;
	}
	
};

public class DayTestAbstract{
	
	public static void main(String args[])
	{
		for(Day day:Day.values()){
			System.out.printf("%s(%d),next is %s\n" ,day,day.getDayNumber(),day.next() );
		}
		
	}
}