import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.AtomicMoveNotSupportedException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;
import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;


public class MoveFile{
	
	public static void main(String args[]) throws IOException{
			
		Path source = Paths.get("G:\\GAURANG123\\JAVA\\IO\\CharStreamClass\\Files\\NIO\\PathDemo.class");
		
		Path target = Paths.get("G:\\GAURANG123\\JAVA\\IO\\CharStreamClass\\Files\\NIO\\testing\\abc.class");
			
		try{
			Path p = Files.move(source,target,ATOMIC_MOVE);
			System.out.println(source + " has been moved to "+ p);
		}
		catch(NoSuchFileException e)
		{
				System.out.println(" source/target doesnt exist ");
		}
		catch(FileAlreadyExistsException e)
		{
				System.out.println(target+" target already exist  moved failed");
		}
		catch(DirectoryNotEmptyException e){
			System.out.println(target+ " target is not empty moved failed ");	
		}
		catch(AtomicMoveNotSupportedException e){
			System.out.println(" Atmoic move is not supported , move failed ");	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}