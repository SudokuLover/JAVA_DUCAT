import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class JLabels extends JFrame{
	
	public static void main(String args[])
	{
		new JLabels();
	}
	
	public JLabels(){
		super("using HTML in JLabels");
		
		WindowUtilities.setNativeLookAndFeel();
		addWindowListener(new ExitListener());
		
		Container content = getContentPane();
		
		Font font = new Font("sherif", Font.PLAIN,30);
		content.setFont(font);
		
		String labelText = "<HTML><FONT COLOR=RED>RED</FONT>" + " and " + "<FONT COLOR=BLUE>BLUE</FONT>Text</HTML>";
		
		JLabel coloredLabel = new JLabel(labelText,JLabel.CENTER);
		
		Border b= BorderFactory.createTitledBorder("Mixed Border");
		
		coloredLabel.setBorder(b);
		
		content.add(coloredLabel,BorderLayout.NORTH);
		
		//--------------------another text----------------------------------
		
		labelText = "<HTML><B>BOLD</B>" + " and " + "<I>ITALIC</I>Text</HTML>";
		
		JLabel boldLabel = new JLabel(labelText,JLabel.CENTER);
				
		boldLabel.setBorder(BorderFactory.createTitledBorder("Mixed Fonts"));
		
		content.add(boldLabel,BorderLayout.CENTER);
		
		labelText = "<HTML>"
				+ "India is a good country"
				+ "on the world" +" <P>"
				+ "major cities of India"
				+ "<UL"
				+ "<LI> DELHI"
				+ "<LI> MUMBAI"
				+ "<LI> ETC."
				+ "</UL";
		
		JLabel fancyLabel = new JLabel(labelText,JLabel.CENTER);
		fancyLabel.setBorder(BorderFactory.createTitledBorder("Multi-Line HTML"));
		
		content.add(fancyLabel,BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
}

