//same class listener
import java.awt.*;
import java.awt.event.*;

class EventDemo implements ActionListener {
	
	Frame f;
	TextField tf;
	Button b,b1;
	
	EventDemo(String s)
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
		new EventDemo("EventDemo");
	}
}