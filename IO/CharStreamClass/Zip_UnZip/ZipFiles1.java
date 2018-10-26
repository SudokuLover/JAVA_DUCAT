import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFiles1{
	
	public static void main(String args[]){
		
		try{
			FileOutputStream fos = new FileOutputStream("Test.zip");
			ZipOutputStream  zos = new ZipOutputStream(fos);
			
			String file1name ="abc.txt";
			String file2name ="ab.txt";
			String file3name ="chacha.txt";
			String file4name ="chachi.txt";
			
			addToZipFile(file1name,zos);
			addToZipFile(file2name,zos);
			addToZipFile(file3name,zos);
			addToZipFile(file4name,zos);
			
			zos.close();
			fos.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public static void addToZipFile(String filename,ZipOutputStream zos) throws FileNotFoundException,IOException {
		System.out.println("Writing "+filename+" zipFile");
		//File file = new File(filename);
		//FileInputStream fis = new FileInputStream(file);
		
		FileInputStream fis = new FileInputStream(filename);
		
		ZipEntry zipEntry = new ZipEntry(filename);
		
		zos.putNextEntry(zipEntry);
		
		byte[] bytes = new byte[fis.available()];
		
		fis.read(bytes);
		
		zos.write(bytes);
		zos.closeEntry();
		fis.close();
	}

}
