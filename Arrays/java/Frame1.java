import java.awt.*;
//import java.awt.ToolKit.*;
class Frame1{
Frame f;
TextField tf;
Button b;
Label l;

Frame1(String s){
f= new Frame(s);
l=new Label("enter number");
l.setBounds(40,40,80, 20);
f.add(l);
tf=new TextField();
tf.setBounds(150,40,80, 20);
f.add(tf);
b=new Button("ok");
b.setBounds(40,140,80, 20);
f.add(b);
/*ToolKit t= f.getToolKit();
Dimension screenSize = t.getScreenSize(); // return screen size 
int width= screenSize.width*8/10;
int height= screenSize.height*8/10;
f.setBounds(width/8,height/8,width,height);
*/
f.setBounds(400,200,600,400);
f.setLayout(null);
f.setVisible(true); 
}


public static void main(String... s){
Button b[25];
new Frame1("first frame");
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
 
 b[i]= new Button(i.toString());   
  
}


}

}