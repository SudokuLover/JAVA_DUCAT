import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SFrame implements ActionListener {
	
	JFrame sf;
	JTextField jtf;
	JButton jb;
	Button b1;
	//Icon i;
	SFrame(String s)
	{
		//i=new ImageIcon("pp.gif");
		
		sf=new JFrame(s);

		jtf=new JTextField();
		jtf.setBounds(150, 40,100, 100);
		
		jb=new JButton("Swing");
		jb.setBounds(40,40,100,100);

		b1=new Button("Awt");
		b1.setBounds(40,150,100,100);
		
		jb.addActionListener(this);
		b1.addActionListener(this);
	
	Container c =sf.getContentPane();
		c.add(jtf);
		c.add(b1);
		c.add(jb);
		
		jb.addActionListener(this);
		c.setLayout(null);
		//windows constant
		sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sf.setSize(400,400);
		sf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==jb)
			jtf.setText("Swing");
		
		else if (e.getSource()==b1)
			jtf.setText("Awt");
	}
	
	public static void main(String args[])
	{
		new SFrame("EventDemo");
	}
}

