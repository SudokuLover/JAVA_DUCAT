import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CLayout implements ActionListener {
	
	JFrame f;
	JPanel jp;
	JButton[] b;
	CardLayout cl;
	
	CLayout(String s1)
	{	
		jp= new JPanel();
		cl=new CardLayout();
		jp.setLayout(cl);
		f=new JFrame(s1);

		b=new JButton[5];
		
		String s[]={"north","south","east","west","center"};
	
		for(int i=0;i<b.length;i++)
		{
			b[i]=new JButton(s[i]);
			b[i].addActionListener(this);
			jp.add(b[i],"t"+i);
		}

		f.add(jp);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		cl.next(jp);
	}
	public static void main(String args[])
	{
		new CLayout("Card Layout");
	}
}

