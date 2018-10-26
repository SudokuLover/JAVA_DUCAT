public class Split2{
	
	public static void main(String args[]){
		
		String str1 = new String("welcome-to-tutorials-of-string");
		
		
		System.out.println("Retruned Value: ");
		
		String s[]=str1.split("-",2);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("Retruned Value: ");
		
		 s=str1.split("-",3);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("Retruned Value: ");
		
		
		 s=str1.split("-",0);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("Retruned Value: ");
		
		 s=str1.split("-");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		

	}
	
}