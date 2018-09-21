class Q2min{
    static void min(int a[])
    {
     int k=9999999;
        
        for(int i=0;i<a.length;i++)
        {
            if(k>a[i])
                k=a[i];
        }
        System.out.println(k);
    }
    public static void main(String args[])
    {
        int x[]={4,5,2,3,4,45,3,654};
        min(x);
       
    }
}