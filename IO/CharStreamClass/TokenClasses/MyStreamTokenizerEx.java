import static java.io.StreamTokenizer.TT_EOF;
import static java.io.StreamTokenizer.TT_NUMBER;
import static java.io.StreamTokenizer.TT_WORD;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class MyStreamTokenizerEx{
	
	public static void main(String args[])throws IOException{
		String str="this is the test,200 which is simple 50";
		StringReader sr=new StringReader(str);
		
		StreamTokenizer st = new StreamTokenizer(sr);
		try{
			while(st.nextToken()!=TT_EOF){
				switch(st.ttype){
					case TT_WORD:/*a word has been read*/
						System.out.println("String Value: "+st.sval);
						break;
					case TT_NUMBER: /*a NUMBER has been read*/
						System.out.println("Number Value: "+st.nval);
						break;
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		
	}
	
}	

