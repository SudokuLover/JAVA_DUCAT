import java.io.*;
 class MyByteWritter{
	 public static void main(String args[]) throws IOException{
		 ByteArrayOutputStream fw = new ByteArrayOutputStream();
		 String s="my india is best";
		 byte ch[]= s.getBytes();
		 
		 for(int i=0;i<ch.length;i++)
			 fw.write(ch[i]);//fw.write(ch);
		 fw.writeTo(new FileOutputStream("abc.txt"));
		 fw.writeTo(new FileOutputStream("def.txt"));
		 System.out.println(fw.toString());
		 
		 byte z[]= fw.toByteArray();
		 
		 ByteArrayInputStream fr = new ByteArrayInputStream(z);
		 
		 int i=0;
		 while((i=fr.read())!=-1){
			System.out.println((char)i);
		 }
		 
	 }
 }