import java.io.*;
class MyStreamTokenizer{
	public static void main(String args[]) throws IOException{
		FileInputStream fis = new FileInputStream("abc.txt");
		InputStreamReader ir = new InputStreamReader(fis);
		
		StreamTokenizer st = new StreamTokenizer(ir);
		st.eolIsSignificant(true);
		st.wordChars(33,255);
		st.whitespaceChars(0,32);
		
		int token=0;
		int count=0;
		
		while(true)
		{
			
			token=st.nextToken();
			
			if(token==StreamTokenizer.TT_EOF)
				break;
			if(token==StreamTokenizer.TT_NUMBER)
				System.out.println(st.nval+ " number");
			if(token==StreamTokenizer.TT_WORD)
				System.out.println(st.sval+ " WORD");
			
			count++;
			
		}
		
		System.out.println("number of word"+ --count);
	}
	
	
}