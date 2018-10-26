import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ExtractZip1{
	
	public static void main(String args[])throws IOException{
		
		try{
			ZipFile zipFile= new ZipFile("Test.zip");
			
			Enumeration enum1 = zipFile.entries();
			
			while(enum1.hasMoreElements())
			{
				ZipEntry zipEntry= (ZipEntry) enum1.nextElement();
				
				String name = zipEntry.getName();
				
				System.out.println("name="+name);
				
				InputStream in = zipFile.getInputStream(zipEntry);
				
				File file= new File("G:\\GAURANG123\\JAVA\\IO\\CharStreamClass\\Zip_UnZip\\files\\"+name);
				
				FileOutputStream fos = new FileOutputStream(file);
				//FileOutputStream fos = new FileOutputStream(name);
				
				int length;
				
				while((length=in.read())!=-1){
					fos.write(length);
					
				}
				in.close();
				fos.close();
			}
			zipFile.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
