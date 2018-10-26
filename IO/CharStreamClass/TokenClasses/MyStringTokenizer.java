import java.io.*;
import java.util.*;

class MyStringTokenizer{
	
	public static void main(String args[])throws IOException{
		String s="Country= India; Capital= Delhi; Country= Japan; Capital= Don't know;";
		
		StringTokenizer st= new StringTokenizer(s,";=");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		
	}


	
}