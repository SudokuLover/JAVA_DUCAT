class Q10matrixAdd{
 static void matrixAdd(int a[][],int b[][])
 {
     int i,j;
     int c[][] = new int[2][2];
     for(i=0;i<a.length;i++)
     {
         for(j=0;j<a[i].length;j++)
         {
             c[i][j]=a[i][j]+b[i][j];
         }
     }
       for(i=0;i<c.length;i++)
     {
         for(j=0;j<c[i].length;j++)
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
        matrixAdd(x,y);
    }
}