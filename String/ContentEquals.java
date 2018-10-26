public class ContentEquals{
	
	public static void main(String args[]){
		String s="not immutable";
		String str="Strings are not immutable";
		StringBuffer sb=new StringBuffer("not immutable");
		
		boolean result =s.contentEquals(sb);
		
		System.out.println(result);
			
			result=str.contentEquals(sb);
			System.out.println(result);
	}
	
}