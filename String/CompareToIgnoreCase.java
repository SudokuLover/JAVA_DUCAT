public class CompareToIgnoreCase{
	
	public static void main(String args[]){
		
		String str1="Strings are immutable";
		String str2="Strings are immutable";
		String str3="Integers are not immutable";
		
		int result = str1.compareTo(str2);
		System.out.println("Compare To =" + result);
	
		 result = str1.compareToIgnoreCase(str2);
		System.out.println("Compare To =" + result);
		
		 result = str2.compareToIgnoreCase(str3);
		System.out.println(result);
			
		 result = str3.compareToIgnoreCase(str1);
		System.out.println(result);
	
	
	
	}

}