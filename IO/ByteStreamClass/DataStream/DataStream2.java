//put data in file line by line
import java.io.*;
class DataStream2{
	
	public static void main(String s1[]) throws IOException{
		
		DataInputStream din = new DataInputStream(System.in);
		FileOutputStream fout = new FileOutputStream("NurtureClasses.txt");
		PrintStream dout = new PrintStream(fout);
		
		String s="";
		
		while(!s.equals("stop")){
			s=din.readLine();
			dout.println(s);
		}
		din.close();
		din.close();
	}
}