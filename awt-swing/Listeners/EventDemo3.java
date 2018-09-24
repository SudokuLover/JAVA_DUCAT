import java.awt.*;
import java.awt.event.*;


class EventDemo3  {
	
	Frame f;
	TextField tf;
	Button b;
	
	EventDemo3(String s)
	{
		f=new Frame(s);


		b=new Button("Ok");
		b.setBounds(20,100,40,40);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setText("hello java");
			}
		});
		
		f.add(b);
		
		tf=new TextField();
		tf.setBounds(20, 40,100, 40);
		f.add(tf);
	
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main(String args[])
	{
		new EventDemo3("EventDemo3");
	}
}

