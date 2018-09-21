class Q4min{
    static void min(int a[][])
    {
     int k=9999999;
        
        for(int i=0;i<a.length;i++)
        {
             for(int j=0;j<a[i].length;j++)
             {
                    if(k>a[i][j])
                         k=a[i][j];
             }
        }
        System.out.println(k);
    }
    public static void main(String args[])
    {
        int x[][]={{4,5,2},{3,4,45},{3,654,1}};
        min(x);
       
    }
}