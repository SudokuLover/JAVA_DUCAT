import java.io.*;
class MyFileWritter{
	public static void main(String s1[]) throws IOException{
		FileWriter fw = new FileWriter("Nurture1.txt");
		//FileWritter fw = new FileWritter("Nurture1.txt",true);
		//FileWritter fw = new FileWritter(new File("G:\\GAURANG123\\JAVA\\IO\\CharStreamClass\\Nurture1.txt"));
		
		String s="I love my Country India";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			fw.write(ch[i]);//fw.write(ch);//fw.write(s);
		}
		fw.close();
		
	}
	
}

