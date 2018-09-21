class Q30hcf{

    static void hcf(int a[])
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
        System.out.println("hcf is "+l);
    }

    public static void main(String args[])
    {
        int x[] = {80, 20, 30, 40, 50,100};
        hcf(x);
  
    }
}
