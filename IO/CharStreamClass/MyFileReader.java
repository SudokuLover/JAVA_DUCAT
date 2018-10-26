import java.io.*;
class MyFileReader{
	public static void main(String s1[]) throws IOException{
		FileReader fr = new FileReader("Nurture1.txt");
		int i=0;
		while((i=fr.read())!=-1)
			System.out.println((char)i);
		fr.close();
	
		
	}
	
}

