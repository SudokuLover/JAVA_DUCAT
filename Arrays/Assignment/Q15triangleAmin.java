class Q15triangleAmin{
 static void triangleAmin(int a[][])
 {
     int i,j,k=111111110;
     
     for(i=0;i<a.length;i++)
     {
         for(j=i;j<a.length;j++)
         {
          if(k>a[i][j])
          {
               k= a[i][j];
             
          }
            
            
         }
         
     }
       
           System.out.print(k);
       }
  
    public static void main(String args[])
    {
        int x[][]={{4,5,6},{2,7,3},{1,2,3}};
        triangleAmin(x); 
    }
}
