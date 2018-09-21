class Q1max{
 static void max(int x[])
 {
 int k=-9999999;
 for(int i=0;i<x.length;i++)
        {
            if(k<x[i])
                k=x[i];
        }
        System.out.println(k);
  }
    public static void main(String args[])
    {
        
        int a[]={4,5,2,3,4,45,3,654};
        max(a);
    }
}