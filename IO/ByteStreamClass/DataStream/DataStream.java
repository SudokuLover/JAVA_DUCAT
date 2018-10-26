//take data from file but put in one line 
import java.io.*;
class DataStream{
	
	public static void main(String []hello)throws IOException{
	
		DataInputStream din = new DataInputStream(System.in);
		FileOutputStream fout = new FileOutputStream("NurtureClasses.txt");
		DataOutputStream dout = new DataOutputStream(fout);
		
		String s= " ";
		
		while(!s.equals("stop")){
			s=din.readLine();
			System.out.println(s);
			//dout.writeChars(s);
			//dout.writeUTF(s);
			dout.writeBytes(s);
			dout.flush();
		}
		dout.close();
		din.close();
	}
}