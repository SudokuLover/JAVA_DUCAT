class Q27sequenceDiagonalWise{

    static void sequenceDiagonalWise(int a[][])
    {
       int i=0,j=0;
        while(i!=a.length && j!=a.length)
        {
            if(i==0)
            { 
                while(i<a.length&&j>=0)
                {
                    System.out.print(a[i][j]+",");
                    i++;
                    j--;
                }
                j++;
                System.out.println();
            }
            else if(j==0)
            {
                      while(j<a.length&&i>=0)
                {
                    System.out.print(a[i][j]+",");
                    j++;
                    i--;
                }
                i++;
                 System.out.println();
            }
        }
        if(a.length%2==0)
        {j--;
         i++;
        }
        else
        {
            i--;
            j++;
        }
        
        while(i!=a.length && j!=a.length)
        {
            if(i==a.length-1)
            {
                while(j<a.length)
                {
                System.out.print(a[i][j]+",");
                i--;
                j++;
                }
                j--;
                i+=2;
                System.out.println();
            }
            else if(j==a.length-1)
            {
                while(i<a.length)
                {
                    System.out.print(a[i][j]+",");
                    j--;
                    i++;
                }
                    i--;
                j+=2;
                System.out.println();
            }
        }
           
        
        
        
         
            
    }
    

    public static void main(String args[])
    {
        int x[][] = {{1,2,3},{4,5,6},{7,8,9}};
       //int x[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,12,15,16}};
      //  int x[][]={{1,2},{3,4}};
        sequenceDiagonalWise(x);
  
    }
}

