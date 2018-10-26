public class GetBytes{
	
	public static void main(String args[]){
		
		String str1 = new String("welcome to tutorials of string");

		try{
			byte []str2=str1.getBytes();
			for(int i=0;i<str2.length;i++)
			{
				System.out.println(str2[i]);
			}
		}
		catch(Exception e){
			System.out.println("unsupported character set");
		}
		
	}
	
}