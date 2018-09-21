class Q26printDiagonalWise{

   static void printDiagonalWise(int a[][])
    {
        int i=0,j=0;
        int u=a.length;
     while((i!=a.length)&&(j!=a.length))
     {
         int k=i;int y=j;
         while(y>=0&&k<a.length)
         {
             System.out.print(a[k][y]+", ");
             k++;
             y--;
         }
         System.out.println();
        
         if(j>=a.length-1)
         {
             i++;
             j=a.length-1;
         }
         else
         {
              i=0;
              j++;
         }
         
     }
        
    }
    

    public static void main(String args[])
    {
        int x[][] = {{8,2,3},{7,5,1},{4,50,10}};
        printDiagonalWise(x);
  
    }
}