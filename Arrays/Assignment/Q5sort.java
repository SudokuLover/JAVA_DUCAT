class Q5sort{
 static void sort(int a[])
 {
 int k;
    for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                     k=a[j];
                    a[j]=a[j+1];
                    a[j+1]=k;
                }
              
            }
        }
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }
  }
    public static void main(String args[])
    {
        
        
        int x[]={4,5,2,3,4,45,3,654};
        sort(x);
    }
}