import java.io.*;

class PrintWritter{
	
	public static void main(String h[]) throws IOException{
		
		PrintWriter pw = new PrintWriter(new FileWriter("def.txt"));
		pw.println("hello");
		pw.println("hey");
		pw.close();
		System.out.println("file created");
		
	}
	
}