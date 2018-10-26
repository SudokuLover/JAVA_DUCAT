import java.io.*;
import java.util.*;

class SInput{
	
	public static void main(String s1[]) throws IOException{
		//SequenceInputStream sis = new SequenceInputStream(new FileInputStream("abc.txt"),new FileInputStream("xyz.txt"));
		
		SequenceInputStream sis = new SequenceInputStream(new MyEnum());
		
		DataInputStream din= new DataInputStream(sis);
		String s=" ";
		
		while(s!=null)
		{
			s= din.readLine();
			if(s!=null)
				System.out.println(s);
			
		}
		din.close();
	}
	
}

class MyEnum implements Enumeration{
	
	InputStream in[];
	int i=-1;
	
		MyEnum(){
			try{
				in = new InputStream[]{
					new FileInputStream("chacha.txt"),
					new FileInputStream("chachi.txt"),
					new FileInputStream("pss.txt")
					};
				}
			catch(Exception e){
				
			}
		}
			public boolean hasMoreElements(){
			
			System.out.println("has more element");
			if(++i<in.length)
				return true;
			else
				return false;
			}
		
			public Object nextElement(){
				System.out.print("next Element"+i);
				return in[i];		
			}
		
	}