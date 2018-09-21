class Q29lcm{

    static void lcm(int a[])
    {
        int l=0;
        int u=0;
        int k=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(k<a[i])
                k=a[i];
        }
        for(int i=2;i<=k;i++)
        {u=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]%i!=0)
                {
                    u=1;
                    break;
                }
            }
         if(u==0&&l<i)
         {
             l=i;
         }
        }
        //above code is for hcf 
        int c=1;
       for(int i=0;i<a.length;i++)
       {
          c*=a[i];
       }
        c/=l;
        System.out.println("your lcm is "+c);
    }

    public static void main(String args[])
    {
        int x[] = {80, 20, 30, 40, 50,100};
        lcm(x);
  
    }
}
