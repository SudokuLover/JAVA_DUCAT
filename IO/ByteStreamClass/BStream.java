import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BStream{
	
	public static void main(String []args) {
		String srcFile="lalu.txt";
			
			try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile))){
				//read one byte at a time and display it
				byte byteData;
				while((byteData=(byte)bis.read())!=-1)
				{
					System.out.println((char)byteData);
				}
			}
			catch(Exception e){
				e.printStackTrace();
			
			}
			
		
	}
	
	
}
