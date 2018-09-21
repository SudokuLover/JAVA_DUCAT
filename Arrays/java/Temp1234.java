class Temp1234{
 
int x=3444;
//static int x=10;

void show(int x)
{

System.out.println(x);
System.out.println(this.x);

}

public static void main(String... s)
{
 Temp1234 t=new Temp1234();
  t.show(20);
}


}