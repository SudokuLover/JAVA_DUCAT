import java.io.*;
class Ps{
	public static void main(String afs[]) throws IOException{
	
		FileOutputStream fout = new FileOutputStream("chachi.txt");
		PrintStream ps = new PrintStream(fout);
		
		FileOutputStream fout1 = new FileOutputStream("chacha.txt");
		PrintStream ps1 = new PrintStream(fout1);
		
		System.out.println("before");
		
		PrintStream ps4 = System.out;
		System.setOut(ps);
		System.setErr(ps1);
		
		System.out.println("chachi420");
		System.out.println("chachi840");
		
		System.err.println("chacha420");
		System.err.println("chacha840");
		
		//System.out=ps4;
		
		System.setOut(ps1);
		System.out.println("after");
		ps4.println("via actual out");
		
		
		
	
	}
	
}