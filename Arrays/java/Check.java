// it is made to check can we pass object in static function and 
//i came to known no we cant pass but can create object there 


class Check{


int x=10;
static int z=100;

void show(int y)
{
System.out.println("non static");
System.out.println(x);
System.out.println(y);
} 
static void display(int r)
{
System.out.println("static");
System.out.println(z);
System.out.println(r);
Check t1=new Check();

t1.show(39);

System.out.println(t1.x);
}



public static void main(String... s)
{

//display(200);

Check t=new Check();

t.show(399);

display(288);

Check.display(456);
System.out.println(t);


}





}