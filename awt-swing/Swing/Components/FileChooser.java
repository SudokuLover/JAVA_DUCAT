import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class FileChooser extends JFrame implements ActionListener{
	
	JFileChooser jfc;
	
	public FileChooser(){
		super("JFileChooser");
		jfc=new JFileChooser("");
		
		JButton jb=new JButton("ok");
		jb.addActionListener(this);
	
		getContentPane().add(jb);
		setLayout(new FlowLayout());
		setSize(400, 400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		int x=jfc.showOpenDialog(null);
		//showSaveDialogBox(null)
		if(x==jfc.APPROVE_OPTION)
		{
			File f=jfc.getSelectedFile();
			System.out.println(f.getPath());
			
			String s=jfc.getName();
			System.out.println(s);
			
			File f1=jfc.getCurrentDirectory();
			System.out.println(jfc.getName(f1));
		}
		
		if(x==jfc.CANCEL_OPTION)
		{
			System.out.println("cancel");
			
		}
				
	}
	
	public static void main(String args[])
	{
	
		new FileChooser();
	}
	
}

