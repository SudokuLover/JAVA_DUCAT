import java.io.*;
class Temp{
	public static void main(String ags[]) throws IOException
	{
		FileOutputStream fout = new FileOutputStream("abc.txt");
		PrintStream ps = new PrintStream(fout);
		ps.println("hello");
		ps.println("hey");
		
	}
	
}