class Temp{

int x;
Temp(){
x=10;
}

int show(){
System.out.println(x);
return 10;
}

public static void main(String... s){

//Temp t=new Temp();// object 

System.out.println(new Temp().x); // new object accessing x
System.out.println( new Temp().show());   // calling function via object  t.show();
System.out.println(new Temp());         // printing Refrence ID
System.out.println(new Temp());
System.out.println(new Temp());
}

}