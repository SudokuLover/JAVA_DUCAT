class Q11matrixMultiply{
 static void matrixMultiply(int a[][],int b[][])
 {
     int i,j,sum=0;
     int c[][] = new int[2][2];
     for(i=0;i<a.length;i++)
     {
         for(j=0;j<b.length;j++)
         {
             sum=0;
            for(int k=0;k<a[i].length;k++)
            {
                sum+=a[i][k]*b[k][j];
}
             c[i][j]=sum;
            
         }
     }
       for(i=0;i<a.length;i++)
     {
         for(j=0;j<a[i].length;j++)
         {
           System.out.print(c[i][j]+" "); 
         }
           System.out.print("\n");
     }

       }
  
    public static void main(String args[])
    {
        int x[][]={{4,5},{2,3}};
        int y[][]={{45,3},{654,8}};
        matrixMultiply(x,y);
     }
}