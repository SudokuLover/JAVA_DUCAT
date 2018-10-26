//create delete rename

import java.io.File;

public class CDR{
	public static void main(String args[])throws Exception{
		
		//File newFile=new File("my_name_file.java");
		
		File newFile=new File("my_name_file.txt");
		
		Thread t= new Thread();
		
		printFileDetails(newFile);
		//create File
		t.sleep(5000);
		
		boolean fileCreated = newFile.createNewFile();
		
		t.sleep(1000);
		
		if(!fileCreated){
			System.out.println(newFile+" could not be created ");
		}
		
		printFileDetails(newFile);
		t.sleep(1000);
		
		//delete the new file
		
		newFile.delete();
		t.sleep(1000);
		
		System.out.println("after deleting the new File");
		
		printFileDetails(newFile);
		t.sleep(1000);
		//re-create the file
		
		newFile.createNewFile();
		t.sleep(1000);
		printFileDetails(newFile);
		
		//lets tell the jvm to delete the file on Exit
		
		newFile.deleteOnExit();
		t.sleep(1000);
		System.out.println("after using delete on exit() method");
		
		printFileDetails(newFile);
		t.sleep(1000);
		//create  new File & rename it;
		
		File firstFile=new File("my_first_file.txt");
		t.sleep(1000);
		File secondFile=new File("my_second_file.txt");
		t.sleep(1000);
		fileCreated = firstFile.createNewFile();
		t.sleep(1000);
		if(fileCreated || firstFile.exists())
		{
			printFileDetails(firstFile);
			printFileDetails(secondFile);
			
			boolean renameFlag = firstFile.renameTo(secondFile);
			t.sleep(1000);
			if(!renameFlag)
			{
				System.out.println("could not rename "+ firstFile);
			}
			
			printFileDetails(firstFile);
			printFileDetails(secondFile);
		}
		
	}
	
	public static void printFileDetails(File f){
		System.out.println("Absoulte Path "+ f.getAbsoluteFile());
		System.out.println("File Exist "+ f.exists());
	}

}