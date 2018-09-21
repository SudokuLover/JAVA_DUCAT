//this is   used to check the priority of super(); in constructor calling of parent class and  
//the this(); of constructor chaining 

class Par{

Par(){
this(20);
System.out.println("parent class");
}


Par(int x)
{
System.out.println("parent class");
System.out.println("parent class + constructor  chaining "+x); 
}

}



class Chl extends Par{



Chl(){
this(200);
System.out.println("child class 1");

}

Chl(int x){
//System.out.println("super is calling in second connstructor ");
super();
System.out.println("super is calling in second connstructor ");
System.out.println("child class + constructor  chaining"+x);
System.out.println("child class 2");

}

public static void main(String... s)
{
 
Chl t= new Chl();

System.out.println("child class  after constructor  "+ t);
 
}



}