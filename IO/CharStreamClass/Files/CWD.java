//current working directory
import java.io.IOException;

public class CWD{
	
	public static void main(String args[]) throws IOException{
			
			String curDir = System.getProperty("user.dir");
			System.out.println(curDir);
	}

}