import java.io.File;

public class DeleteFolder{
	
	public static void main(String args[]){
		
		File f=new File("G:\\GAURANG123\\JAVA\\IO\\CharStreamClass\\Files\\folder");
		
		deleteFolder(f);//first need to make folder empty itself
		
		f.delete();
	}
	
	public static void deleteFolder(File f){
		File file[]=f.listFiles();
		
		for(File f1:file)
		{
			if(f1.isDirectory())
				deleteFolder(f1);
			
			f1.delete();
		}
		
	}

}