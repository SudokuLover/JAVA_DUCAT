public class GetChars{
	
	public static void main(String args[]){
		
		String str1 = new String("welcome to tutorials of string");
		
		char []str2=new char[7];
		
		char c[]=str1.toCharArray();
		
		try{
			
			str1.getChars(2, 9, str2, 0);
			System.out.println("copied value=");
			
			for(int i=0;i<str2.length;i++)
			{
				System.out.println(str2[i]);
			}
			
			System.out.println();
			for(int i=0;i<c.length;i++)
			{
				System.out.println(c[i]);
			}
		}
		catch(Exception e){
			System.out.println("Raised exception");
		}
		
	}
	
}