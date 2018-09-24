import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class JColorChooserText extends JFrame implements ActionListener{
	
	public static void main(String args[])
	{
		new JColorChooserText();
	}
	
	public JColorChooserText(){
		super("using JColorChooserText");
		
		WindowUtilities.setNativeLookAndFeel();
		addWindowListener(new ExitListener());
		
		Container content = getContentPane();
		
		content.setBackground(Color.WHITE);
		content.setLayout(new FlowLayout());
		JButton colorButton = new JButton("ChooseBackgroundColor");
		
		colorButton.addActionListener(this);
		content.add(colorButton);
		setSize(300,100);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		Color bgColor =JColorChooser.showDialog(this, "Choose Background Color", Color.red);
		if(bgColor!=null)
			getContentPane().setBackground(bgColor);
	}
}

