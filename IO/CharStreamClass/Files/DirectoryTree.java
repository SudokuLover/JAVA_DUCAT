import java.io.File;

public class DirectoryTree{
	
	public static void main(String args[]){
		
		File file=new File(args[0]);
		
		if(!file.exists())
		{
			System.out.println(args[0]+ "doesn't not exists");
			return;
		}
		tree(args[0]);
	}
	
	public static void tree(String fileName){
	
		File file=new File(fileName);
		if(!file.isDirectory())
		{
			System.out.println(fileName);
			return ;
		}
		
		String Files[]=file.list();
		
		for(int i =0;i<Files.length;i++)
		{
			tree(fileName+ file.separator + Files[i]);
		}
	}

}