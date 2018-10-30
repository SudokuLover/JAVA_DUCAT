import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str() ;
	int val();
}

public class Meta{
	
	//annotate a method
	@MyAnno(str="Annotation Example",val=100)
	
	public static void myMeth(){
		
		Meta ob=new Meta();
		
		try{
			Class c=ob.getClass();
			
			//now get a method object that represents this method
			Method m=c.getMethod("myMeth");
			//next get the annotation for this class
			MyAnno anno = m.getAnnotation(MyAnno.class);
			//finally display the values
			System.out.println(anno.str()+" "+anno.val());
		}
		catch(NoSuchMethodException e){
			System.out.println(e);
			
		}
	}
	public static void main(String ...args)
	{
		myMeth();
	}
}
