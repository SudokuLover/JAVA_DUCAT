import java.util.Arrays;
import java.util.Scanner;

class Q7RTrim {
	
	
	public static String rtrim(String s){
		
		char c[]=s.toCharArray();
		
		int k=0;
		
		for(int i=c.length-1;i>=0;i--)
		{
			if(c[i]!=' ')
			{
				k=i;
				break;
			}
		}
		
		char s1[]= new char[k+1];
		
		int y=-1;
		for(int i=0;i<=k;i++)
		{
			s1[++y]=c[i];
		}
		
		return String.valueOf(s1);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String c= rtrim(s);
		
		System.out.println(c);
		
		System.out.println(c.length() + " " + s.length());
		
		
	}

}