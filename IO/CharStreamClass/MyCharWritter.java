import java.io.*;
class MyCharWritter{
	
	public static void main(String s1[]) throws IOException{
		
		CharArrayWriter fw = new CharArrayWriter();
		String s="hello world , now i am ready to get you";
		char ch[]=s.toCharArray();
		//for(int i=0;I,ch.length;i++)
			//fw.write(ch[i]);
		fw.write(s);
		fw.writeTo(new FileWriter("abc.txt"));
		System.out.println(fw.toString());
		
		char z[]=fw.toCharArray();
		
		CharArrayReader fr = new CharArrayReader(z);
		
		int i=0;
		
		while((i=fr.read())!=-1)
			System.out.println((char)i);

	}	
	
}