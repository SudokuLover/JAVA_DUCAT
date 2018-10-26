import java.util.Arrays;
import java.util.Scanner;

class Q4StringReverse {
	
	
	public static String stringReverse(String s){
		
		char []c=s.toCharArray();
		
		for(int i=0;i<c.length/2;i++)
		{
			char k=c[i];
			c[i]=c[c.length-i-1];
			c[c.length-i-1]=k;
		}

		return String.valueOf(c);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String c= stringReverse(s);
		
		System.out.println(c);
		
		
	}

}