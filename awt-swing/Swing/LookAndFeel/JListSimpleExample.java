import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListSimpleExample extends JFrame {
	
	public static void main(String args[])
	{
		new JListSimpleExample(); 
	}
	
	private JList sampleJList;
	private JTextField valueField;
	public JListSimpleExample(){
		
		super("creating a simple list");

		WindowUtilities.setNativeLookAndFeel();
		addWindowListener(new ExitListener());
		
		Container content = getContentPane();
		
		//create  the Jlist , set the no. of visible rows add
		// alistener, and put it in a JScrollPane
		
		
		String []entities={"Entry1","Entry2","Entry3","Entry4","Entry5","Entry6"};
		
		sampleJList = new JList(entities);
		sampleJList.setVisibleRowCount(4);
		
		Font displayFont = new Font("serif",Font.BOLD,18);
		sampleJList.setFont(displayFont);
		sampleJList.addListSelectionListener(new ValueReporter(sampleJList,valueField));
		
		JScrollPane listPane= new JScrollPane(sampleJList);
		
		JPanel listPanel = new JPanel();
		
		listPanel.setBackground(Color.WHITE);
		Border listPaneBorder = BorderFactory.createTitledBorder("SampleJList");
		listPanel.setBorder(listPaneBorder);
		
		listPanel.add(listPane);
		content.add(listPane, BorderLayout.CENTER);
		
		JLabel valueLabel = new JLabel("Last Selection");
		valueLabel.setFont(displayFont);
		
		valueField = new JTextField("none",7);
		valueField.setFont(displayFont);
		
		JPanel valuePanel = new JPanel();
		valuePanel.setBackground(Color.WHITE);
		
		Border valuePanelBorder = BorderFactory.createTitledBorder("JListSelection");
		valuePanel.setBorder(valuePanelBorder);
		valuePanel.add(valueLabel);
		valuePanel.add(valueField);
		
		content.add( valuePanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
}

private class ValueReporter implements ListSelectionListener{
	

	private JList sampleJList;
	private JTextField valueField;
	
	public ValueReporter(JList sampleJList, JTextField valueField) {
		

		this.sampleJList=sampleJList;
		this.valueField= valueField;
		
		// TODO Auto-generated constructor stub
	}

	public void valueChanged(ListSelectionEvent e)
	{
		valueField.setText(sampleJList.getSelectedValue().toString());
	}
}


class ExitListener extends WindowAdapter {
	
	public void closing(WindowEvent event)
	{
		System.exit(0);
	}
}



class WindowUtilities {
	
	public static void setNativeLookAndFeel(){
		try{
			String s=UIManager.getSystemLookAndFeelClassName();
			
			UIManager.setLookAndFeel(s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void setJavaLookAndFeel(){
		try{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void setMotifLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}


