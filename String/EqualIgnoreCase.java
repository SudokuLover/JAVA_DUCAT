public class EqualIgnoreCase{
	
	public static void main(String args[]){
		
		String str1 = new String("this is really not immutable");

		String str2=str1;
		
		String str3 = new String("this is Really not immutable");
		
		boolean retVal;
		
		retVal=str1.equals(str2);
		System.out.println("Returned String: " + retVal );
		
		retVal=str1.equals(str3);
		System.out.println("Returned String: " + retVal );
		
		
		retVal=str2.equalsIgnoreCase(str3);
		System.out.println("Returned String: " + retVal );
		
	}
	
}