import java.util.Arrays;
import java.util.Scanner;

class Q9RemoveAllSpaces {
	
	
	public static String removeAllSpaces(String s){
		
		char []c=s.toCharArray();
		
		int k=0;
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
				k++;
		}
		
		char ch[]= new char[c.length-k];
		
		int p=-1;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				ch[++p]=c[i];
			}
		}

		return String.valueOf(ch);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String c= removeAllSpaces(s);
		
		System.out.println(c);
		
		
	}

}