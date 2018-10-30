class EnumExample1{
	
	public enum season{WINTER,SPRING,SUMMER,FALL}
	//public enum season{WINTER,SPRING,SUMMER,FALL};
	
	public static void main(String args[])
	{
		for(season s:season.values()){
			System.out.println(s);
		}
	
	}
}
