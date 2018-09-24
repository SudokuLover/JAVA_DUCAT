import java.awt.*;
import javax.swing.*;

class JButtons extends JFrame {
	

	public static void main(String args[])
	{
		new JButtons();
	}
	
	public JButtons()
	{	super("Using JButton");
		
	//WindowUtilities.setMotifLookAndFeel();
	//WindowUtilities.setJavaLookAndFeel();
	WindowUtilities.setNativeLookAndFeel();
	addWindowListener(new ExitListener());
	
	Container content =getContentPane();
	content.setLayout(new FlowLayout());
	
	JButton button1= new JButton("First");
	
	content.add(button1);
	
	JButton button2= new JButton("Second");
	
	content.add(button2);
	
	pack();
	setVisible(true);
	}
}

