import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FLayout {
	
	JFrame f;
	JButton[] b;
	
	FLayout(String s1)
	{	
		f=new JFrame(s1);

		b=new JButton[5];
		
		String s[]={"north","south","east","west","center"};
	
		for(int i=0;i<b.length;i++)
		{
			b[i]=new JButton(s[i]);
			f.add(b[i]);
		}

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setLayout(new FlowLayout(FlowLayout.LEFT,40,40));
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main(String args[])
	{
		new FLayout("Flow Layout");
	}
}

