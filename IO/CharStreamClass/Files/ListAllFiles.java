import java.io.File;

public class ListAllFiles{
	
	public static void main(String args[])
	{
		//change the dirPath value to list files from your directory
		String dirPath="G:\\";
		
		File dir=new File(dirPath);
		File []list=dir.listFiles();
		
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isFile())
			{
				System.out.println(list[i].getPath()+ " ( File ) " );
			}
			else if(list[i].isDirectory())
			{
				System.out.println(list[i].getPath()+ " ( Directory ) " );
			}
			
		}
	}


}