package HangBang;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class HangBang extends JFrame implements ActionListener{
	static String p1,p;
	static int r=0,x=-1;
	static int[] num= new int[26];
	static int chances;
	JScrollPane sp,sp1;
	static int win;
	static String a[]={"ducat","codingninjas","codingblocks","string","yawning","auspicious","threading","networking","brilliant","invincible","avengers","dextercoding","maharajaagrasen"};
	static String b[]={"institute in noida","institute nearst to kohat enclave","institute affliated to vmc","sequence of character","normal when you wake up","conducive to success","multitasking in java","how to transfer file between systems","IQ level is high","unbeatable","famous series","institute near ducat in noida","colege afflaited to ggsipu in rohini"};
	JTextField tf2,tf3,tf4,tf5,tf6;
	static JTextField tf7;
	JLabel l1,l2,l3,l4,l5,h1,l14;
	static JLabel l6;
	JLabel l7,l8,l9,l10,l11,l12,l13;
	JButton b1,b2,b3,b4,b5,b6,b7;
	static JTextArea ta1;
	JTextArea ta2;
	// UI
	HangBang(String s)
	{
		super(s);
			//text field
			getContentPane().setBackground(  new Color(212, 249, 7) );
				l1=new JLabel("NUMBER OF CHANCES REMAINS:");
				l1.setBounds(150,160,200,30);
				add(l1);
				
				h1=new JLabel("<html><span style='font:30px'>"+"<font color='#f90737'>HANGBANG</font>"+"</span></html>");
				h1.setBounds(350,0,500,100);
				add(h1);
				
				tf3=new JTextField();
				tf3.setBounds(360,160,30,30);
				add(tf3);
				tf3.setEditable(false);
				
				l2=new JLabel("PREDICT THE WORD:");
				l2.setBounds(150,120,200,30);
				add(l2);
				
				tf4=new JTextField();
				tf4.setBounds(360,120,200,30);
				add(tf4);
				tf4.setEditable(false);
				
				l3=new JLabel("GAME STATUS:");
				l3.setBounds(150,200,200,30);
				add(l3);
				
				tf5=new JTextField();
				tf5.setBounds(360,200,200,30);
				add(tf5);
				tf5.setText("YET TO START");
				tf5.setEditable(false);
				
				l4=new JLabel("WINING %:");
				l4.setBounds(150,240,200,30);
				add(l4);
				
				tf6=new JTextField();
				tf6.setBounds(360,240,200,30);
				add(tf6);
				tf6.setText("INFINITY");
				tf6.setEditable(false);
				
				l14=new JLabel("WORD DESCRIPTION:");
				l14.setBounds(150,280,200,30);
				add(l14);
				tf7=new JTextField();
				tf7.setBounds(360,280,200,30);
				add(tf7);
				tf7.setEditable(false);
				
				
				l5=new JLabel("ENTER THE CHARACTER TO GUESS THE WORD:");
				l5.setForeground(new Color(212, 77, 242));
				l5.setBackground(new Color(177, 243, 249));
				l5.setOpaque(true);
				l5.setBounds(50,320,300,30);
				add(l5);
				
				tf2=new JTextField();
				tf2.setBounds(360,320,50,30);
				add(tf2);
				tf2.setEditable(false);
				
				l6=new JLabel("");
				l6.setBounds(160,360,250,30);
				add(l6);
				
				l7=new JLabel("");
				l7.setBounds(100,440,700,30);
				add(l7);
				//text area
				ta1=new JTextArea();
				//ta1.setBounds(100, 450,550,300);
				ta1.setText("YOUR GAME STATUS WILL BE SHOWN HERE");
				ta1.setEnabled(false);
				ta1.setBackground(Color.BLACK);
				//ta1.setBackground(new Color(79, 247, 216));
				sp = new JScrollPane(ta1);
				sp.setBounds(100, 500,550,300);
				getContentPane().add(sp);
				
				ta2=new JTextArea("WANNA WRITE ANYTHING \nCAN DO HERE ");
				//ta2.setBounds(700, 50,200,200);
				sp1 = new JScrollPane(ta2);
				sp1.setBounds(700, 500,200,200);
				getContentPane().add(sp1);
				
				
			//button
				b1= new JButton("START");
				b1.setBounds(110,850,100,30);
				b1.addActionListener( this);
				add(b1);
				
				b2= new JButton("PAUSE");
				b2.setBounds(250,850,100,30);
				b2.addActionListener( this);
				add(b2);
				
				b3= new JButton("RESUME");
				b3.setBounds(390,850,100,30);
				b3.addActionListener( this);
				add(b3);
				
				b5= new JButton("RESTART");
				b5.setBounds(520,850,100,30);
				b5.addActionListener( this);
				add(b5);
				
				
				
				b4= new JButton("ENTER");
				b4.setBounds(200,400,200,30);
				b4.addActionListener( this);
				add(b4);
				
				b6= new JButton("RULES");
				b6.setBounds(650,850,100,30);
				b6.addActionListener( this);
				add(b6);
				
				b7= new JButton("HINT");
				b7.setBounds(450,400,100,30);
				b7.addActionListener( this);
				add(b7);
				b7.setEnabled(false);
				b7.setVisible(false);
				
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				
				JLabel w[]= new JLabel[]{l1,l2,l3,l4,l14};
				for(int o=0;o<w.length;o++)
				{
					w[o].setForeground(new Color(247, 32, 179));
					w[o].setBackground(new Color(237, 210, 56));
					w[o].setOpaque(true);
				}
				
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
	}
	//find no. ofcharacter remain in char bank  
	public static int charRemain(){
		int k=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==0)
				k++;
		}
		
		return k;
	}
	//find no of character reamins in given word
	public static int wordRemain(){
		int k=0;
		char[] ch=p.toCharArray();
		for(int i=0;i<p.length();i++)
		{
			if(ch[i]=='#')
				k++;
		}
		
		return k;
	}
	//find win%
	public static int win1(){
		try{
			win=(chances*100)/wordRemain();
		}
		catch(Exception e)
		{
			
		}
		return win;
		
	}
	//create chances according to a word 
	public static int count(){
		int k=p.length();
		if(k<=5)
			chances= 2;
		else
			chances= ((k/2)+1);
		return chances;
	}
	//set word for game in # actual string is inside p1
	public static String setWord(){
		Random i= new Random();
		int k=i.nextInt(a.length);
		//int y=a[k].length();
		p1=a[k];
		char ch[]=a[k].toCharArray();
		for( int i1=0;i1<p1.length();i1++)
			ch[i1]='#';
		tf7.setText(b[k]);
		 k=i.nextInt(p1.length());
		char c=p1.charAt(k);
		ch[k]=c;
		p=new String(ch);
		return p;
	
	}

	//checks enter charecter is correct or not
	public static String letsCheck(String c){
		int y=0;
		char q=c.charAt(0);
		char ch[]=p.toCharArray();
		for(int i=0;i<p.length();i++){
			if(p1.charAt(i)==q)
			{
				ch[i]=q;
				y=1;
				x=0;
				l6.setText("input character is correct");
			}
				
		}
		if(y==0)
		{
			x=1;
			l6.setText("input character is incorrect");
			chances--;
		}
		p=new String(ch);
		return p;
	}
	//main func
	public static void main(String... args) {
		
		new HangBang("HangBang");

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//start
		if(e.getSource()==b1)
		{
			x=-1;
			for(int i=0;i<26;i++)
				num[i]=0;
			b1.setText("START");
			l2.setText("PREDICT THE WORD:");
			r=0;
			b1.setBounds(110,850,100,30);
			b3.setEnabled(false);
			l7.setText("");
			tf2.setText("");
			tf4.setText(setWord());
			tf3.setText(String.valueOf(count()));
			tf6.setText(String.valueOf(win1()));
			tf2.setEditable(true);
			tf5.setText("Game Has Been Started");
			b2.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b7.setVisible(true);
			b7.setEnabled(true);
			b7.setText("HINT");
			ta2.setText("WANNA WRITE ANYTHING \nCAN DO HERE\n\n\n\n\n ENTERED CHARACTER\nWILL BE SHOWN HERE ALSO ");
			ta2.setEnabled(true);
			l6.setText("");
			ta1.setText("YOUR GAME STATUS WILL BE SHOWN HERE\nYOUR GAME HAS BEEN STARTED");
			
		}
		//pause
		if(e.getSource()==b2)
		{
			tf2.setEditable(false);
			b2.setEnabled(false);
			tf5.setText("Game Has Been paused");
			b3.setEnabled(true);
			b4.setEnabled(false);
			ta2.setEnabled(false);
			
			b7.setEnabled(false);
			String q=ta1.getText();
			
			ta1.setText(q+"\n******YOUR GAME HAS BEEN PAUSED*****");
			
		}
		//resume
		if(e.getSource()==b3)
		{
			if(b7.getText()=="HINT")
			{
				b7.setEnabled(true);
			}
			ta2.setEnabled(true);
			
			tf2.setEditable(true);
			b3.setEnabled(false);
			b2.setEnabled(true);
			b4.setEnabled(true);
			String q=ta1.getText();
			ta1.setText(q+"\n******YOUR GAME HAS BEEN RESUMED*********");
			
			tf5.setText("Game Has Been resumed");
		}
		//restart
		if(e.getSource()==b5)
		{
			main();
		}
		//rules
		if(e.getSource()==b6){
			if(b6.getText()=="RULES")
			{

				JButton w[]= new JButton[]{b1,b2,b3,b4,b5,b7};
				for(int y=0; y< w.length ;y++)
				{
					w[y].setVisible(false);
				}
				
				b6.setText("HIDE RULES");
				l14.setVisible(false);
				tf7.setVisible(false);
				b6.setBounds(30,120,200,30);
				JLabel W[]= new JLabel[]{l1,l2,l3,l4,l5,l6,l7};
				for(int y=0; y< W.length ;y++)
				{
					W[y].setVisible(false);
				}
				
				JTextField tf[]= new JTextField[]{tf2,tf3,tf4,tf5,tf6}; 
				for(int y=0; y< tf.length ;y++)
				{
					tf[y].setVisible(false);
				}
				sp.setVisible(false);
				sp1.setVisible(false);
				///ta2.setVisible(false);
				l8=new JLabel("RLUE1:  ENTER ONE CHARACTER EACH TIME TO GUESS THE WORD ");
				l8.setBounds(0,200,900,30);
				add(l8);
				
				l11=new JLabel("RLUE2:  YOUR CHANCES WILL BE DEDUCTED ON WRONG INPUT CHARACTER ");
				l11.setBounds(0,250,900,30);
				add(l11);
				
				l9=new JLabel("RLUE3:  FOR EACH CORRECT INPUT CHARACTER, YOUR CHANCES WILL NOT BE DEDUCTED ");
				l9.setBounds(0,300,900,30);
				add(l9);
				
				l10=new JLabel("RLUE4:  YOU CAN USE HINT ONLY ONCE PER GAME THAT WILL GIVE A CHARACTER WHICH IS PROBABLY 70% CORRECT OR MIGHT 30% WRONG ");
				l10.setBounds(0,350,900,30);
				add(l10);
				
				l12=new JLabel("RLUE5:  APPEARING CHARACTER BY DEFAULT MAY OCCURE MULTIPLE TIMES");
				l12.setBounds(0,400,900,30);
				add(l12);
				
				l13=new JLabel("RLUE6:  CHANCES WILL BE REDUCED BY ONE ON USE OF HINT");
				l13.setBounds(0,450,900,30);
				add(l13);
				JLabel t[]= new JLabel[]{l8,l9,l10,l11,l12,l13};
				for(int o=0;o<w.length;o++)
				{
					t[o].setForeground(new Color(128, 7, 249));
					t[o].setBackground(new Color(9, 237, 249));
					t[o].setOpaque(true);
				}
				b6.setBounds(30,550,200,30);
			}
			else if(b6.getText()=="HIDE RULES")
			{

				//ta1.setVisible(true);
				l14.setVisible(true);
				tf7.setVisible(true);
				sp1.setVisible(true);
				sp.setVisible(true);	
				b6.setBounds(650,850,100,30);
				JButton w[]= new JButton[]{b1,b2,b3,b4,b5,b7};
				for(int y=0; y< w.length ;y++)
				{
					w[y].setVisible(true);
				}
				
				JLabel W[]= new JLabel[]{l1,l2,l3,l4,l5,l6,l7};
				for(int y=0; y< W.length ;y++)
				{
					W[y].setVisible(true);
				}
				W= new JLabel[]{l8,l9,l10,l11,l12,l13};
				for(int y=0; y< W.length ;y++)
				{
					W[y].setVisible(false);
				}
				JTextField tf[]= new JTextField[]{tf2,tf3,tf4,tf5,tf6}; 
				for(int y=0; y< tf.length ;y++)
				{
					tf[y].setVisible(true);
				}
				
				b6.setText("RULES");
			}
		}
		//hint
		if(e.getSource()==b7)
		{
			String q=ta1.getText();
			ta1.setText(q+"\n#########  YOU HAE USED YOUR ONLY HINT  ######\n");
			chances--;
			tf3.setText(String.valueOf(chances));
			Random i1= new Random();
			int k=i1.nextInt(10);
			if(k<8)
			{
				String f = tf4.getText();
				char a[]=f.toCharArray();
				char b[]=new char[wordRemain()];
				int j=-1;
				for(int i=0;i<a.length;i++)
				{
					if(a[i]=='#')
					{
						b[++j]=p1.charAt(i);
					}
					
				}
				 k=i1.nextInt(b.length);
				b7.setEnabled(false);
				b7.setText(String.valueOf(b[k]));
			}
			else{
				
				char b[]=new char[charRemain()];
				int j=-1;
				for(int i=0;i<num.length;i++)
				{
					if(num[i]==0)
					{
						i+=97;
						b[++j]=(char)i;
					}
				}
				k=i1.nextInt(num.length);
				b7.setEnabled(false);
				b7.setText(String.valueOf(num[k]));
			}
		}
		//enter
		if(e.getSource()==b4)
		{
			l6.setText("");
			if(tf2.getText().equals("")){
				l6.setText("please enter your character");
			}
			else{
				String g= tf2.getText();
				String c= g.toLowerCase();
				byte k[] = c.getBytes();
				k[0]-=97;
				if(num[k[0]]==1)
				{
					l6.setText("this character has been entered already");
				}
				else if(num[k[0]]!=1)
				{
					String z=letsCheck(c);
					if(x==0)
					{
						String p= ta1.getText();
						ta1.setText(p+"\n----------------------------------------------------------------------\nENTER CHARACTER IS CORRECT\n");
					}
					else if(x==1)
					{
						String p= ta1.getText();
						ta1.setText(p+"\n-----------------------------------------------------------------------\nENTER CHARACTER IS INCORRECT\n");
					}
					x=-1;
					num[k[0]]=1;
					String q=ta2.getText();
					
					ta2.setText(q+"\n      "+c);
					
					if(chances>0)
					{	
						tf2.setText("");
						tf4.setText(z);
						tf3.setText(String.valueOf(chances));
						String p= ta1.getText();
						ta1.setText(p+"\n"+(++r)+"\n"+"ENTERED CHARACTER IS:  "+c+"\nNOW WORD IS:  "+z+"\n"+"NUMBER OF CHANCES REMAIN:  "+String.valueOf(chances)+"\n");
					}
					if(wordRemain()!=0)
					{
						tf6.setText(String.valueOf(win1()));
						String p= ta1.getText();
						ta1.setText(p+"WIN PERCENTAGE: "+String.valueOf(win1())+"\n");
					}
					//win
					else{

						b7.setVisible(false);
						tf2.setEditable(false);
						l2.setText("WORD WAS");
						l7.setText("<html><font color='red'>WOW! YOU HAVE WON THE GAME, HOPE YOU HAVE ENJOYED THE GAME CLICK ON RESTART TO PLAY AGAIN</font></html>");
						tf5.setText("WIN");
						tf6.setText("INFINITY");
						b1.setText("RESTART GAME");
						b1.setBounds(100,850,140,30);
						b2.setEnabled(false);
						b3.setEnabled(false);
						b4.setEnabled(false);
						b5.setEnabled(false);
						String p= ta1.getText();
						ta1.setText(p+"\nYOU HAVE WON THE GAME, KINDLY RESTART THE GAME TO PLAY AGAIN");
					
						
					}
				}
				//loss
				if(chances==0){
					tf2.setEditable(false);

					b7.setVisible(false);
					l2.setText("WORD WAS");
					tf4.setText(p1);
					l7.setText("<html><font color='red'>OOPS! YOU HAVE LOST THE GAME, HOPE YOU HAVE ENJOYED THE GAME, CLICK ON RESTART TO PLAY AGAIN</font></html>");
					tf5.setText("LOSS");
					tf6.setText("INFINITY");
					b1.setText("RESTART GAME");
					b1.setBounds(110,850,140,30);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);

					String p= ta1.getText();
					ta1.setText(p+" \n YOU HAVE LOST THE GAME, KINDLY RESTART THE GAME TO PLAY AGAIN");
				}
				
			}
				
		}
		
	}

}
