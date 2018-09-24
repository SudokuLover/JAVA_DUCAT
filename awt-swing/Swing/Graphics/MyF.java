import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCanvas1 extends Canvas {
	Image i;
	
	public MyCanvas1(){
		Toolkit t=Toolkit.getDefaultToolkit();
		i=t.getImage("G:\\GAURANG123\\JAVA\\awt-swing\\Swing\\Graphics\\m1.jpg");
	}
	
	public void paint(Graphics g)
	{
			g.drawImage(i, 100,100, this);
	}

}

class MyF extends Frame{
	
	MyF(){
		super("graphics");
		
		MyCanvas1 m = new MyCanvas1();
		add(m);

		setBackground(Color.red);
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String []args)
	{
		new MyF();
	}
}

