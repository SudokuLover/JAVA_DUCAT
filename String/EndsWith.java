public class EndsWith{
	
	public static void main(String args[]){
		
		String str = new String("this is really not immutable");

		boolean retVal;
		
		retVal=str.endsWith("Immutable");
		System.out.println("Returned String: " + retVal );
		
		retVal=str.endsWith("immutable");
		System.out.println("Returned String: " + retVal );
		
	}
	
}