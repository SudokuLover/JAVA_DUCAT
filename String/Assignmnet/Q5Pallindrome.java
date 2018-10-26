import java.util.Arrays;
import java.util.Scanner;

class Q5Pallindrome{
	
	public static boolean checkPallindrome(String s)
	{
		
		
		char []s1=s.toCharArray();
		int k=s1.length;
		
		for(int j=0;j<k/2;j++)
		{
			
			if(s1[j]!=s1[k-j-1])
				return false;
				
			
					
		}
		
		return true;
	
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s= sc.nextLine();
		
		boolean i=checkPallindrome(s);
		
		System.out.println(i);

	}
	
	
}