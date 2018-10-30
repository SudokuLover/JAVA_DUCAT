import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str() ;
	int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
	String description();
}

@What(description ="an annotation test class")
@MyAnno(str="class",val=99)
public class Meta2{
	
	@What(description ="an annotation test method")
	@MyAnno(str="Method",val=100)
	
	public static void myMeth(){
		
		Meta2 ob=new Meta2();
		
		try{
			Annotation  annos[] =ob.getClass().getAnnotations();
			MyAnno  m =ob.getClass().getAnnotation(MyAnno.class);
			
			System.out.println(m.getClass().getName());
			System.out.println(m.str());
			System.out.println(m.val());
		}
		catch(Exception e){
			System.out.println(e);
			
		}
	}
	public static void main(String ...args)
	{
		myMeth();
	}
}
