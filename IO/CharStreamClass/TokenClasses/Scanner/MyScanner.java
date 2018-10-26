import java.io.*;
import java.util.*;

class MyScanner{
	
	public static void main(String args[]) throws IOException{
		Scanner sc= new Scanner(System.in);
		String s="";
		
		while(!s.equals("stop")){
			s=sc.nextLine();
			System.out.print(s);
		}
	}
}