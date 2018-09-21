class A{

A(){
System.out.println("A");
}

}

class B extends A{

B(){
System.out.println("B");
}

}



class C extends B{

{
System.out.println("IN IT BLOCK");
}


C(){
this(40);
System.out.println("C");
}


C(int x){
super();
System.out.println(x);
}



public static void main(String... s){
// String args[]
new C();
new C(10);

}

}