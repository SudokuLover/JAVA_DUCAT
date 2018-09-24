import java.awt.*;
import java.awt.event.*;

class OuterListener implements ActionListener{
	EventDemo1 f;
	
	OuterListener(EventDemo1 f)
	{
		this.f=f;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==f.b)
			f.tf.setText("ok");
		
		else if (e.getSource()==f.b1)
			f.tf.setText("cancel");
	}
	
}


class 	 EventDemo1 {
	
	Frame f;
	TextField tf;
	Button b,b1;
	
	EventDemo1(String s)
	{
		f=new Frame(s);


		b=new Button("Ok");
		b.setBounds(20,100,40,40);

		b1=new Button("cancel");
		b1.setBounds(80,100,40,40);
		
		OuterListener outer=new OuterListener(this);
		b.addActionListener(outer);
		b1.addActionListener(outer);

		f.add(b);
		f.add(b1);
		
		tf=new TextField();
		tf.setBounds(20, 40,100, 40);
		f.add(tf);
	
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main(String args[])
	{
		new EventDemo1("EventDemo");
	}
}

