import java.util.*;
public class LambdaWithCollection{
	
	public static void main(String ...s1) throws Exception{
	
		String []str={"lalu","rabari","messa","nitish"};
		
		List<String> family=Arrays.asList(str);
		
		for(String i:family)
		{
			System.out.println(i);
		}
		System.out.println("");
		
		//using lambda expression and functional operations
		
		family.forEach((s)->System.out.print(s+";"));

		System.out.println("");
		
		//using double colon (resolution ) operation in java8
		
		family.forEach(System.out::println);
	}
}
