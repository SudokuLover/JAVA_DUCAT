class Q12matrixTranspose{
 static void matrixTranspose(int a[][])
 {
     int i,j,k=0;
     
     for(i=0;i<a.length;i++)
     {
         for(j=0;j<i;j++)
         {
           k= a[i][j];
             a[i][j]=a[j][i];
             a[j][i]=k;
         }
         
     }
       for(i=0;i<a.length;i++)
     {
         for(j=0;j<a[i].length;j++)
         {
           System.out.print(a[i][j]+" "); 
         }
           System.out.print("\n");
     }

       }
  
    public static void main(String args[])
    {
        int x[][]={{4,5},{2,3}};
        matrixTranspose(x);
    }
}