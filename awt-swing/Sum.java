import java.awt.*;
import java.awt.event.*;

class Sum implements ActionListener {
	
	Frame f;
	TextField tf1,tf2,tf3;
	Button b;
	
	Sum()
	{
		//i=new ImageIcon("pp.gif");
		
		f=new Frame("sum");

		b=new Button("Sum");
		b.addActionListener(this);

		tf1=new TextField();
		
		tf2=new TextField();
		
		tf3=new TextField();
		
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b);
		
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b){
		
			String s1=tf1.getText().toString();
			String s2=tf2.getText().toString();
			
			int x=Integer.parseInt(s1);
			int y=Integer.parseInt(s2);
			
			tf3.setText(""+(x+y));
		
		}
		
	
		
	}
	
	public static void main(String args[])
	{
		new Sum();
	}
}

