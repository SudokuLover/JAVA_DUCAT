import java.util.Scanner;

class Q3CharCount{
	
	public static int charCount(String s)
	{
		return s.length();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s= sc.nextLine();
		
		int i=charCount(s);
		System.out.println(i);
	}
	
	
}