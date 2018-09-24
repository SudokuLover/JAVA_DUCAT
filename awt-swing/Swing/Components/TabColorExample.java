import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TabColorExample extends JPanel {
	
	public TabColorExample(){
		
		setLayout(new BorderLayout());
		UIManager.put("TabbedPane.selector", Color.green);
		
	//	JTabbedPane tabbedPane=new JTabbedPane();
		
		JTabbedPane tabbedPane=new JTabbedPane(JTabbedPane.TOP);
		
		String tabs[]={"one","two","three","four"};
		Color []colors={Color.pink,Color.red,Color.yellow,Color.blue};
		
		for(int i=0;i<tabs.length;i++)
		{
			JPanel jp =createPane(tabs[i]);
			tabbedPane.add(tabs[i], jp);
			tabbedPane.setBackgroundAt(i,colors[i]);
		}
		tabbedPane.setSelectedIndex(0);
		
		add(tabbedPane,BorderLayout.CENTER);
	}
	
	JPanel createPane(String s){
		JPanel p=new JPanel();
		p.add(new JLabel(s));
		return p;
		
	}
	
	
	public static void main(String args[])
	{
		JFrame frame = new JFrame("tab color example");
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		frame.getContentPane().add(new TabColorExample());
		frame.setSize(400,400);
		//frame.pack();
		frame.setVisible(true);
	}
	
	
}
