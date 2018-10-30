import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str() default "Testing";
	int val() default 9000;
}

public class DefaultValue{
	
	//@MyAnno()
	//@MyAnno(str="Hello",val=1000)
	
	public static void myMethod(){
		
		DefaultValue ob=new DefaultValue();
		
		try{
			Class c=ob.getClass();
			
			Method m=c.getMethod("myMethod");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			
			System.out.println(anno.str()+" "+anno.val());
		}
		catch(NoSuchMethodException e){
			System.out.println(e);
			
		}
	}
	public static void main(String ...args)
	{
		myMethod();
	}
}
