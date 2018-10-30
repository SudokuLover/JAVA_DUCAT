import java.lang.annotation.*;
import java.lang.reflect.*;

//external handler
public class ExHandler{

	
	public static void readAnnotation(){
		Single ob=new Single();
		try{
			Method m =ob.getClass().getMethod("myMeth");
			
			MySingle anno=m.getAnnotation(MySingle.class);
			
			int x=anno.value();
			System.out.println(anno.getClass().getName());
			
		}
		catch(NoSuchMethodException e){
			System.out.println(e);
			
		}
	}
	public static void main(String ...args)
	{
		readAnnotation();
	}
}
