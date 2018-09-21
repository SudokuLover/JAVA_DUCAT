class Q34mode{

    static int mode(int a[])
    {
        int b,c=0,k=0;
        for(int i=0;i<a.length;i++)
        {
            b=0;
            if(a[i]==0)
                continue; 
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                 a[j]=0;
                 b++;    
                }
            }
            if(b>k)
            {
                b=k;
                c=a[i];
            }
        }
        return c;
    }

    public static void main(String args[])
    {
        int x[] = {1, 2, 3, 4, 5,55,5,5,5,5};
       int p= mode(x);
        System.out.println(p);
    }
}
