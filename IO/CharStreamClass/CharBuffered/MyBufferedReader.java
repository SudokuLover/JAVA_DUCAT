import java.io.*;

class MyBufferedReader{
	
	public static void main(String h[]) throws IOException{
		
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String s=" ";
		
		while(!s.equals("stop")){
			s=br.readLine();
			if(s!=null)
				System.out.println(s);
		}
	}
	
}