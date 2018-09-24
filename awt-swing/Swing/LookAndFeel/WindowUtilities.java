import java.awt.*;
import javax.swing.*;

class WindowUtilities {
	
	public static void setNativeLookAndFeel(){
		try{
			String s=UIManager.getSystemLookAndFeelClassName();
			
			UIManager.setLookAndFeel(s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void setJavaLookAndFeel(){
		try{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void setMotifLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}

