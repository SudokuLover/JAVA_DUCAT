class Q13matrixSum{
 static void matrixSum(int a[][])
 {
     int i,j,k=0;
     
     for(i=0;i<a.length;i++)
     {
         System.out.print(" ");
         k=0;
         for(j=0;j<a[i].length;j++)
         {
             k+=a[i][j];
             System.out.print("    "+a[i][j]);
           }
         System.out.print("    "+k+" \n");
         
     }
     int k1=0;
       for(i=0;i<a.length;i++)
        {
           k+=a[i][i];
           k1+=a[i][a.length-1-i];
     }
     System.out.print(k1);
     
     for(i=0;i<a.length;i++)
     {
        int sum=0;
         for(j=0;j<a.length;j++)
         {
             sum+=a[j][i];
             
           }
         System.out.print("   "+sum);
         
     }
       System.out.print("   "+k);
         
       }
  
    public static void main(String args[])
    {
        int x[][]={{4,5,6},{2,3,1},{1,2,3}};
        matrixSum(x);
    }
}