import java.util.Scanner;

class Q1WordCount{
	
	public static int countWord(String s)
	{
		int i;
		if(s.length()>0)
			i=1;
		else 
			i=0;
		
		char []s1=s.toCharArray();
		
		for(int j=0;j<s1.length;j++)
		{
			if(s1[j]==' ')
			{
				i++;
			}
		}
		
		return i;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s= sc.nextLine();
		
		countWord(s);
	}
	
	
}