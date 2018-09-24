import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyMenu implements ActionListener{
	
	JTextField tf=new JTextField();
	JFrame jf= new JFrame("My Menu");
	JMenuBar menuBar;
	JMenu menu,subMenu;
	JMenuItem menuItem,exit;
	JRadioButtonMenuItem rbMenuItem ;
	JCheckBoxMenuItem cbMenuItem;
	
	MyMenu(){
		jf.add(tf);
		menuBar=new JMenuBar();
		menu = new JMenu("First Menu");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		
		menuItem= new JMenuItem("A text only Menu Item ", KeyEvent.VK_T);
		menuItem.addActionListener(this);
		//Icon i1=new ImageIcon("image/new.gif");
		//menuItem.setIcon(i1);
		
		//KeyStroke i=KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.CTRL_MASK);
		//menu.setAccelerator(i);
		menu.add(menuItem);
		
		//a group of radio button menuitem
		
		menu.addSeparator();
		
		ButtonGroup group=new ButtonGroup();
		 rbMenuItem = new JRadioButtonMenuItem("a radio button menu item");
		  rbMenuItem.setSelected(true);
		  rbMenuItem.setMnemonic(KeyEvent.VK_R);
		  //rbMenuItem.setIcon(new ImageIcon("images/dining.gif"));
		  
		  group.add(rbMenuItem);
		  menu.add(rbMenuItem);
		  
		  rbMenuItem = new JRadioButtonMenuItem("Another One");
		  rbMenuItem.setMnemonic(KeyEvent.VK_0);
		  group.add(rbMenuItem);
		 // rbMenuItem.setIcon(new ImageIcon("images/import.gif"));
		 menu.add(rbMenuItem);

		 menu.addSeparator();
		 // add group of check box
		 
		 cbMenuItem = new JCheckBoxMenuItem("a check box menu item");
		 
		 cbMenuItem.setMnemonic(KeyEvent.VK_C);
		  //cbMenuItem.setIcon(new ImageIcon("images/find.gif")); 
		 menu.add(cbMenuItem);
		  
		  cbMenuItem = new JCheckBoxMenuItem("Another One");
		  cbMenuItem.setMnemonic(KeyEvent.VK_H);
		  // cbMenuItem.setIcon(new ImageIcon("images/cut.gif"));
		 menu.add(cbMenuItem);
		 //a submenu
		 menu.addSeparator();

		 subMenu=new JMenu("A submenu");
		 subMenu.setMnemonic(KeyEvent.VK_S);
		 
		 menuItem = new JMenuItem("an item in submenu");
		 menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,ActionEvent.ALT_MASK));
		 subMenu.add(menuItem);
		 menuItem=new JMenuItem("Another Item");
		 subMenu.add(menuItem);
		 
		 menu.add(subMenu);
		 
		 exit=new JMenuItem("exit");
		 exit.addActionListener(this);
		 
		 exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,ActionEvent.SHIFT_MASK));
		 
		 //exit.setIcon(new ImageIcon("images/stop.gif"));
		 
		 exit.setMnemonic(KeyEvent.VK_X);
		 menu.add(exit);
		 
		 //build a second menu in the menu bar
		 
		 menu = new JMenu("another menu");
	
		 menu.setMnemonic(KeyEvent.VK_N);
		 menuBar.add(menu);
		 jf.setJMenuBar(menuBar);
		 jf.setSize(300, 400);
		 jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("exit"))
			System.exit(0);
		if(e.getActionCommand().equals("A text only Menu Item"))
			tf.setText("hello");
	}
	
	public static void main(String args[])
	{
	
		new MyMenu();
	}
	
}

