// this is used to make , can be pass object as an agrument to a static func

class Static {

int c=100;
static int x=1899;

static void show(int e, Static p)
{
System.out.println(p.c);
System.out.println(x);
System.out.println(e);
System.out.println(p);
}

public static  void  main(String... s)
{

Static t= new Static();


show(100,t);
System.out.println(t);

} 


}