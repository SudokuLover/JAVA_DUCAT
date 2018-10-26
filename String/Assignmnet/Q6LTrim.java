import java.util.Arrays;
import java.util.Scanner;

class Q6LTrim {
	
	
	public static String ltrim(String s){
		
		char c[]=s.toCharArray();
		
		int k=0;
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				k=i;
				break;
			}
		}
		
		char s1[]= new char[c.length-k];
		
		int y=-1;
		for(int i=k;i<c.length;i++)
		{
			s1[++y]=c[i];
		}
		
		return String.valueOf(s1);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String c= ltrim(s);
		
		System.out.println(c);
		
		
	}

}