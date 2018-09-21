class Parent{
 int x=20;
 void show(int y){

System.out.println(x);
System.out.println(y+ " hello ");
} 

}

class Child extends Parent{
 int x=30;

 void show(int y){

System.out.println(x);
System.out.println(y+" bye ");

}
public static void main(String... s){

Child t=new Child();
t.show(400);
//Child.show(300);
//Parent.show(400);
Parent t1 =new Child();
t1.show(10000);
System.out.println(t1.x+"langur" );
//super.show();

}

}
