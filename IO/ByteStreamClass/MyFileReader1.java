
import java.io.*;

class MyFileReader1{
	
	public static void main(String abs[])throws IOException{
		FileInputStream fr= new FileInputStream("abc.txt");
		byte  b[] = new byte[fr.available()];
		fr.read(b);
		String s= new String(b);
		System.out.println(s);
	}
	
}