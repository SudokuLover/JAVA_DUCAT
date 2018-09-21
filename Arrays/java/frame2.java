import java.awt.*;
//import java.awt.ToolKit.*;
class Frame2{
Frame f;
TextField tf;
Button b;
Label l;

Frame2(String s){
f= new Frame(s);
tf=new TextField();
tf.setBounds(40,40,180, 30);
f.add(tf);
f.setBounds(400,200,600,400);
f.setLayout(null);
f.setVisible(true); 
}


public static void main(String... s){
Button b[];
b=new Button[25];
int k=40,l=40,j=20,p=20;
Frame2 f1=new Frame2("first frame");
for(int i=1;i<=5;i++)
{
k=40;
for(int q=1;q<=5;q++)
{
 
 b[i]= new Button(i.toString());   
   b[i].setBounds(k,l,j,p);
      k+=30; 
    f1.add(b[i]);
  
}
l+=30;

}

}


}