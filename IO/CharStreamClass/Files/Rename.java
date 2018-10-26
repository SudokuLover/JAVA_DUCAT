import java.io.File;

public class Rename{
	
	public static void main(String args[])
	{
		//rename old_dummy.txt to new _dummy.txt
		
		File oldFile = new File("CDR.class");
		
		File newFile = new File("new_dummy.txt");
		
		boolean fileRename = oldFile.renameTo(newFile);
		
		if(fileRename)
		{
			System.out.println(oldFile + " Rename to "+ newFile);
		}
		else {
			System.out.println("Renaming "+oldFile + " to "+newFile + " Failed ");
			
		}
		
	}


}