class Q3max{
 static void max(int x[][])
 {
 int k=-9999999;
 for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
              {
                   if(k<x[i][j])
                        k=x[i][j];  
               } 
        }
        System.out.println(k);
  }
    public static void main(String args[])
    {
        
        int a[][]={{4,5,2},{3,4,45},{3,654,1000}};
        max(a);
    }
}