import java.io.*;

class MyFileWritter{
	public static void main(String a[]) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("abc.txt");//write mode
		//FileOutputStream fout = new FileOutputStream("abc.txt",true);//append mode
		//FileOutputStream fout = new FileOutputStream(new File("abc.txt"));
		//FileOutputStream fout = new FileOutputStream(new File("abc.txt"),true);
		String s="India is a great country";
		byte ch[]=s.getBytes();
		//fout.write(ch);  //write all at a time
		for(int i=0;i<ch.length;i++)
		{
			fout.write(ch[i]);//write byte by byte
		}
		fout.close();
		System.out.println("file created successsfully");
	}
		
}