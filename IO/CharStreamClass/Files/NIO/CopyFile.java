import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.DirectoryNotEmptyException;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFile{
	
	public static void main(String args[]){
		
		Path source = Paths.get("G:\\GAURANG123\\JAVA\\IO\\CharStreamClass\\Files\\NIO\\CopyOffset.txt");
		
		Path target = Paths.get("G:\\GAURANG123\\JAVA\\IO\\CharStreamClass\\Files\\NIO\\testing\\test123.txt");
		
		try{
			Path p = Files.copy(source,target,REPLACE_EXISTING,COPY_ATTRIBUTES);
			
			System.out.println(source+ " has been copied to "+p);
		}
		catch(FileAlreadyExistsException e)
		{
			System.out.println(target+ " target already exists ");	
		}
		catch(DirectoryNotEmptyException e){
			System.out.println(target+ " target is not empty ");	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
