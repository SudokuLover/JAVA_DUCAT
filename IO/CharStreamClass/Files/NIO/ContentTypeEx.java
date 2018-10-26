import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class ContentTypeEx{
	public static void main(String s[]){
		
		//Path p=Paths.get("dummy.txt");
		Path p=Paths.get("G:\\GAURANG123\\JAVA\\IO\\CharStreamClass\\Files\\NIO\\daywise.html");
		//Path p=Paths.get("G:\\GAURANG123\\JAVA\\IO\\CharStreamClass\\Files\\NIO\\Temp.doc");
		
		try{
			
			String contentType=Files.probeContentType(p);
			System.out.format("content type of %s is %s of n",p,contentType);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
}

