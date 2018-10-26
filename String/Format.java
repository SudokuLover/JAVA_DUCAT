class Format{
	public static void main(String args[])
	{
		float floatVar=2.4f;
		int intVar=10;
		String stringVar="HINDUSTAN";
		System.out.printf("the value of the integer variable is = %f, while the value of integer variable is = %d, and the string is = %s",floatVar,intVar,stringVar);
		
		String fs = String.format("the value of the integer variable is = %f, while the value of integer variable is = %d, and the string is = %s",floatVar,intVar,stringVar);
		
		System.out.println("");
		System.out.println(fs);
	}
}