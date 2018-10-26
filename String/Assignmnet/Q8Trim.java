import java.util.Arrays;
import java.util.Scanner;

class Q8Trim {
	
	
	public static String trim(String s){
		
		char c[]=s.toCharArray();
		
		int k=0;
		int p=0;
		

		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				p=i;
				break;
			}
		}
		
		
		for(int i=c.length-1;i>=0;i--)
		{
			if(c[i]!=' ')
			{
				k=i;
				break;
			}
		}
		
		char s1[]= new char[k-p+1];
		
		int y=-1;
		for(int i=p;i<=k;i++)
		{
			s1[++y]=c[i];
		}
		
		return String.valueOf(s1);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String c= trim(s);
		
		System.out.println(c);
		
		System.out.println(c.length() + " " + s.length());
		
		
	}

}