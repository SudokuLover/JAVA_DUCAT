import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class JComboEx2 extends JFrame {
	
	public JComboEx2(){
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		String []sList={"Spring","Fall","Winter","Summer"};
		
		JComboBox seasons= new JComboBox(sList);
		seasons.setBounds(40,40,80,40);
		seasons.addItemListener(new MyItem());
		getContentPane().add(seasons);
		setLayout(null);
	}
	
	
	public static void main(String args[])
	{
	
		JComboEx2 com=	new JComboEx2();
		com.setSize(300,300);
		com.setVisible(true);
	}
	
}

class MyItem implements ItemListener{
	public void itemStateChanged(ItemEvent e)
	{
		Object item = e.getItem();
		System.out.println("hello");
		if(e.getStateChange()==ItemEvent.SELECTED)
		{
			System.out.println(item + "has been selected");
		}
		else if(e.getStateChange()==ItemEvent.DESELECTED)
		{
			System.out.println(item + "has been deselected");
		}
	}
}


