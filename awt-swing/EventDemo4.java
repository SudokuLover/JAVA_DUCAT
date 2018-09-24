import java.awt.*;
import java.awt.event.*;

class EventDemo4 implements ActionListener {
	
	Frame f;
	TextField tf;
	Button b,b1;
	
	EventDemo4(String s)
	{
		f=new Frame(s);


		b=new Button("Ok");
		b.setBounds(20,100,40,40);

		b1=new Button("cancel");
		b1.setBounds(80,100,40,40);
		
		b.addActionListener(this);
		b1.addActionListener(this);

		f.add(b);
		f.add(b1);
		
		tf=new TextField();
		tf.setBounds(20, 40,100, 40);
		f.add(tf);
		
		tf.addKeyListener(new KeyListener());
	
		f.addWindowListener(new WindowListener());
		
		f.addMouseListener(new MouseEventListener(this));
		
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b)
			tf.setText("ok");
		
		else if (e.getSource()==b1)
			tf.setText("cancel");
	}
	
	public static void main(String args[])
	{
		new EventDemo4("EventDemo4");
	}
}

class WindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
class MouseEventListener extends MouseAdapter{
	
	EventDemo4 f;
	MouseEventListener(EventDemo4 f)
	{
		this.f=f;
	}
	public void mouseClicked(MouseEvent e1)
	{
		f.tf.setText("Mouse Event");
		f.tf.setBackground(Color.RED);
	}
}

class KeyListener extends KeyAdapter{
	public void keyTyped(KeyEvent e)
	{
		System.out.println(e.getKeyChar());
	}
}

