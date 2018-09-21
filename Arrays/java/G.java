class G{
 int x=this.getX();
int getX()
{
System.out.println(x);
System.out.println(x+"via get function");
return 10;
}

G()
{
System.out.println(x);
System.out.println(x+"via constructor");
}

public static void main(String... s){

new G();

}


}