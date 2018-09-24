import java.awt.*;
import javax.swing.*;

public class RadioButtonPanel extends JFrame{
	
	public RadioButtonPanel(String labelString,JRadioButton []radioButtons,ButtonGroup buttonGroup){
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JLabel(labelString));
		
		for(int i=0;i<radioButtons.length;i++)
		{
			//buttonGroup.add(radioButtons[i]);
			add(radioButtons[i]);
			pack();
			setVisible(true);
		}
		
	}
	
	
	public static void main(String args[])
	{
		JRadioButton jb[]=new JRadioButton[5];
		for(int i=0;i<jb.length;i++)
		{
			jb[i]=new JRadioButton(i+1+"");
		}
		
		ButtonGroup bg=new ButtonGroup();
		
		new RadioButtonPanel("jb Example",jb,bg);
	}
	
}
