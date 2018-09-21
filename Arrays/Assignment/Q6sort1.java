class Q6sort1{
    
 static void sort1(int a[][]){
     
     for(int i=0;i<a.length;i++)
     {
           for(int j=0;j<a[i].length;j++)
           {
               for(int k=0;k<a[i].length-1;k++)
                 {
                     if(a[i][k]>a[i][k+1])
                        {
                           int p=a[i][k];
                           a[i][k]=a[i][k+1];
                           a[i][k+1]=p;
                        }
                }
          }
     }
     for(int i=0;i<a.length;i++)
     {
         for(int j=0;j<a[i].length;j++)
         {
             System.out.print(a[i][j]+" ");
         }
         System.out.println();
     }
     
 } 
    public static void main(String args[])
    {
        int x[][]={{2,3,1},{28,5,78},{9,23,6} };
        sort1(x);
    }
}
