import java.io.*;
class  TempSetOut_Err{
	public static void main(String in[]) throws IOException
	{
		FileOutputStream fout= new FileOutputStream("TempIn.txt");
		PrintStream ps = new PrintStream(fout);
		System.out.println("Hello");
		System.setOut(ps);
		
		System.out.println("hey");
		
		FileOutputStream fout1 = new FileOutputStream("xyz.txt");
		PrintStream ps1 = new PrintStream(fout1);
		System.setErr(ps1);
		System.err.println("hello");
		
	}
	
	
}