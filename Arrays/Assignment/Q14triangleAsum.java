class Q14triangleAsum{
 static void triangleAsum(int a[][])
 {
     int i,j,sum=0;
     
     for(i=0;i<a.length;i++)
     {
         for(j=i;j<a[i].length;j++)
         {
           sum+= a[i][j];
            
            
         }
         
     }
       
           System.out.print(sum);
       }
  
    public static void main(String args[])
    {
        int x[][]={{4,5,6},{2,7,3},{1,2,3}};
        triangleAsum(x); 
    }
}
