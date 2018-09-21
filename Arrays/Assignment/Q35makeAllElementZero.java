class Q35makeAllElementZero{

    static void makeAllElementZero(int a[][])
    {
        int i=0,j=0,p=0;
        int u=a.length-1;
        for(i=0;i<a.length;i++)
        {
           for(j=0;j<a[i].length;j++)
           {
               if(a[i][j]==0)
               {
                    p=1;
                   break;
               }
           }
            if(p==1)
                break;
        }
        if(i==0)
        {
            if(j==0)
            {
                a[1][0]=0;
                a[0][1]=0;
            }
           else if(j==u)
            {
                a[0][u-1]=0;
                a[1][u]=0;
            }
            else
            {
                a[0][j-1]=0;
                a[0][j+1]=0;
                a[1][j]=0;
            }
        }
        else  if(i==u)
        {
            if(j==0)
            {
                a[u-1][0]=0;
                a[u][1]=0;
                
            }
           else if(j==u)
            {
                a[u][u-1]=0;
                a[u-1][u]=0;
            }
            else
            {
                a[u][j-1]=0;
                a[u][j+1]=0;
                a[u-1][j]=0;
            }
        }
        else  {
            if(j==0)
            { 
                a[i-1][0]=0;
                a[i+1][0]=0;
                a[i][1]=0;
            }
            else if(j==u)
            {
                 a[i-1][u]=0;
                a[i+1][u]=0;
                a[i][u-1]=0;
            }
            
            else{
                a[i-1][j]=0;
                a[i+1][j]=0;
                a[i][j-1]=0;
                a[i][j+1]=0;
            }
            
        }
        
             for(i=0;i<a.length;i++)
        {
           for(j=0;j<a[i].length;j++)
           {
               System.out.print(a[i][j]+ " ");
           }
                  System.out.print("\n");
        }
    }
    

    public static void main(String args[])
    {
        int x[][] = {{1,2,3},{4,5,6},{0,8,9}};
       //int x[][] = {{1,2,3,4},{0,6,7,8},{9,10,11,12},{13,12,15,16}};
      //  int x[][]={{1,2},{3,0}};
         makeAllElementZero(x);
  
    }
}
