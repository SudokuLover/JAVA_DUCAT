public class StringB{
	
	public static void main(String args[]){

		StringBuffer sb=new StringBuffer();
		//StringBuffer sb=new StringBuffer(20);
		//StringBuffer sb=new StringBuffer("DUCAT");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		StringBuffer sb1=sb.append("aaaaaaaaaaaaaaaa");
	
		System.out.println("after append ");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("q");
		
		System.out.println("after second append ");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
	}
	
}