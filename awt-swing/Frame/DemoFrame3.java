//frame wrt desktop
import java.awt.*;

class DemoFrame3 {
	
	Frame f;
	Label l;
	TextField tf;
	Button b;
	
	DemoFrame3(String s)
	{
		f=new Frame(s);
		l=new Label("enter no.");
		l.setBounds(40, 40, 80, 20);
		f.add(l);
		
		tf=new TextField();
		tf.setBounds(150, 40,50, 20);
		f.add(tf);
		
		b=new Button("Ok");
		b.setBounds(40,100,50,50);
		f.add(b);
		
		Toolkit t = f.getToolkit();
		Dimension screenSize = t.getScreenSize();
		int width=(screenSize.width)*(8/10);
		int height = screenSize.height*(8/10);
		
		//f.setBounds(width/8,height/8,width,height);
		f.setBounds(400,200,600,400);
		
		f.setLayout(null);
		//f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new DemoFrame3("First Frame");
	}
}