import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCanvas1 extends Canvas {
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawLine(70, 70,200, 200);
		System.out.println("paint");
	}


}

class MyF1{
	MyF1(){
		Frame f=new Frame("Graphics");
		MyCanvas1 c= new MyCanvas1();
		f.add(c);
		f.setSize(400,400);
		//f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String []args)
	{
		new MyF1();
	}
}

