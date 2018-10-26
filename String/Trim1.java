public class Trim1{
	
	public static void main(String args[]){
		
		String str1 = new String("   welcome to tutorials of string    ");
		
		System.out.println(str1);
		
		System.out.println("befor trim "+ str1.length());
		
		System.out.println("Retruned Value: ");
		
		String z=str1.trim();
		
		System.out.println(z);
		
		System.out.println("after trim "+ z.length());
		
	}
	
}