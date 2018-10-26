public class StringBInsert{
	
	public static void main(String args[]){

		StringBuffer sb=new StringBuffer("I Java");
		
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		StringBuffer sb1=sb.insert(2, "like ");
	
		System.out.println(sb);
		
		sb1=sb.replace(2, 6, "Love");
		
		System.out.println(sb);
		
		sb1=sb.delete(2, 6);
		
		System.out.println(sb);
		
		sb1=sb.reverse();
		
		System.out.println(sb);
		
		if(sb1==sb)
			System.out.println("one object");	
	}
	
}