//======================program is about to run show from outside the in which nested class is defined =============


//===============javafx.application.Application=====================

/*class Outer{
int x=10;
static int y=20;
static Outer z;

void display(){
class Inner{

void show(){
System.out.println(x);
System.out.println(y);
}

}

/*Inner a=new Inner();
a.show();
z=a;*/ //check how upcasting work 
}


public static void main(String[] args){
Outer o=new Outer();
o.display();
z.show();
}

}*/

// =================taught by sir =========================




class Outer{
int x=10;
static int y=20;

void show(){
}

Outer display(){
class Inner extends Outer{

void show(){
System.out.println(x);
System.out.println(y);
}

}

Outer  a=new Inner();
a.show();
return a; //check how upcasting work 
}


public static void main(String[] args){
Outer o=new Outer();
 Outer z=o.display();
z.show();
}

}