import java.awt.*;

class MyFrame2 {
	
	Frame f;
	TextField tf;
	Button b;
	
	MyFrame2(String s)
	{
		f=new Frame(s);
		tf=new TextField();
		tf.setBounds(40, 40, 60, 30);
		f.add(tf);
		
		b=new Button("Ok");
		b.setBounds(40,120,40,60);
		f.add(b);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new MyFrame2("hey");
	}
}