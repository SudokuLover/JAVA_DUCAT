public class LastIndexOf{
	
	public static void main(String args[]){
		
		String str1 = new String("welcome to tutorials of string");
		
		String str2 = new String("tutorials");
		
		String str3 = new String("sutorials");
		
		System.out.println("founded index: ");
		
		System.out.println(str1.lastIndexOf("o"));
		
		System.out.println("founded index: ");
		
		System.out.println(str1.lastIndexOf("o",5));
		
		System.out.println("founded index: ");
		
		System.out.println(str1.lastIndexOf(str2));

		System.out.println("founded index: ");
		
		System.out.println(str1.lastIndexOf(str2,5));
		
		System.out.println("founded index: ");
		
		System.out.println(str1.lastIndexOf(str3));




	}
	
}