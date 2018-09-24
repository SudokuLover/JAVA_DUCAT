import java.awt.*;

class MyFrame1 {
	
	Frame f;
	MyFrame1(String s)
	{
		f=new Frame(s);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new MyFrame1("ss");
		new MyFrame1("FF");
	}
}