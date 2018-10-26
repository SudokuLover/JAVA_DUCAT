import java.io.*;

class MyBufferedWritter{
	
	public static void main(String h[]) throws IOException{
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw);
		
		String s=" ";
		
		while(!s.equals("stop")){
			s=br.readLine();
			//bw.write(s);
			//bw.write("");
			//bw.flush();
			pw.println(s);
		}
		br.close();
		bw.close();
		fw.close();
	}
	
}