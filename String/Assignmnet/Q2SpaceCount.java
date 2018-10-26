import java.util.Scanner;

class Q2SpaceCount{
	
	public static int countSpace(String s)
	{
		int i=0;
		
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
		
		int i=countSpace(s);
		System.out.println(i);
	}
	
	
}