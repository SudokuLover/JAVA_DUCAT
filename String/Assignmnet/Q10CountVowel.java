import java.util.Arrays;
import java.util.Scanner;

class Q10CountVowel {
	
	
	public static int countVowel(String s){
		
		char []c=s.toCharArray();
		
		int k=0;
		

		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='A' ||c[i]=='E' ||c[i]=='I' ||c[i]=='O' ||c[i]=='U' ||c[i]=='a' ||c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u' )
				k++;
		}

		return k;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int c= countVowel(s);
		
		System.out.println(c);
		
		
	}

}