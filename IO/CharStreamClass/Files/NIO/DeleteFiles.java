import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;


public class DeleteFiles{
	
	public static void main(String args[]) throws IOException{
			
		Path p = Paths.get("G:\\GAURANG123\\JAVA\\IO\\CharStreamClass\\Files\\NIO\\MoveFile.class");
		
		try{
			//Files.delete(p);
			//System.out.println(p+" Deleted succesfully");
			boolean b = Files.deleteIfExists(p);
			System.out.println(p+" = "+b);
		}
		catch(NoSuchFileException e)
		{
				System.out.println(p+"  doesnt exist ");
		}
		catch(DirectoryNotEmptyException e){
			System.out.println("Directory "+p+ "  is not empty  ");	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}