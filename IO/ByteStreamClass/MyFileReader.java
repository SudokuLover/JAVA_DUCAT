import java.io.*;
class MyFileReader{
	public static void main(String a[])throws IOException{
		FileInputStream fr= new FileInputStream("abc.txt");
		//FileInputStream fr=new FileInputStream(new File("G:\\GAURANG123\\JAVA\\IO\\abc.txt"));
		int i=0;
		while((i=fr.read())!=-1){
			System.out.println((char)i);
		}
		fr.close();
		
	}

}