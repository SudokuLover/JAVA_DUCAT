import java.util.Scanner;

class CheckOneStringInOther
{
	public static void main(String args[])
	{
		String s="",s1="";
		
		Scanner sc = new Scanner (System.in);
		
		s=sc.nextLine();
		s1=sc.nextLine();
		
		//check s1 is in s or not -> cosider length of s is always greater 
		
		int k=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(k==s1.length())
				break;
			
			if(s.charAt(i)==s1.charAt(k))
			{
				k++;
			}
			else{
				k=0;
			}
			
		}
		
		if(k==s1.length())
		{
			System.out.println("string found");
		}
		else{

			System.out.println("string not found"+ k);
		}
		
	}
	
}