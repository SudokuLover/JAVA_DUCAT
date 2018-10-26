import java.util.Arrays;
import java.util.Scanner;

class Q11Length {
	
	
	public static int length(String s){
		
		char []c=s.toCharArray();
		
		int k=0;
		

		for(int i=0;i<c.length;i++)
		{
			k++;
		}

		return k;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int c= length(s);
		
		System.out.println(c);
		
		
	}

}