import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo{
	
	public static void main(String s[]){
		
		Path p1= Paths.get("G:\\GAURANG123\\JAVA\\IO\\CharStreamClass\\Files\\NIO\\PathDemo.java");
		printDetails(p1);
		
		Path p2=Paths.get("PathDemo.java");	
		//printDetails(p2);
	}
	
	public static void printDetails(Path p)
	{
		System.out.println("Details for Path: "+p);
		int count = p.getNameCount();
		System.out.println("Name Count: "+count);
		
		for(int i=0;i<count;i++)
		{
			Path name=p.getName(i);
			System.out.println("name at index "+i+" is " +name);
			
		}
				
		Path parent= p.getParent();
		Path root= p.getRoot();
		Path fileName= p.getFileName();
		
		System.out.println("Parent "+parent+" root " +root + " fileName "+ fileName);
		
		System.out.println("Absolute Path "+p.isAbsolute());
		
	}
	
}