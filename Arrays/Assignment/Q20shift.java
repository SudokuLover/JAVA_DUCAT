
class Q20shift{
    
    static void shift(int a[])
    {
        int j=0;
        for(int i=0;i<a.length;i++)
        {
           if(a[i]<0)
           {
            int k=a[i];
            a[i]=a[j];
            a[j]=k;
            j++;
           }
        }
        
        for(int i=0;i<a.length;i++)
        { 
            for(int k=j;k<a.length-1;k++)
            {
                if(a[k]>a[k+1])
                {
                      int p=a[k];
                       a[k]=a[k+1];
                       a[k+1]=p;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int k=0;k<j-1;k++)
            {
                if(a[k]<a[k+1])
                {
                      int p=a[k];
                       a[k]=a[k+1];
                       a[k+1]=p;
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
        int a[] = {9, -5, -8, -2, -7, -4, 1, 7, 6, 3, 2,-1};
        shift(a);
    }
}