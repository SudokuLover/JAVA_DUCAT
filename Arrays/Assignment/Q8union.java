class Q8union{
    
 static void union(int a[],int b[]){
     
   int z[]=new int [a.length+b.length];
     for(int i=0;i<a.length;i++)
     {
         z[i]=a[i];
     }
     for(int i=a.length;i<z.length;i++)
     {
         z[i]=b[i-a.length];
     }
     
     int k;
    for(int i=0;i<z.length;i++)
        {
            for(int j=i+1;j<z.length;j++)
            {
               if(z[i]==z[j])
               {
                  z[j]=0;
               }
              
            }
        }
       for(int i=0;i<z.length;i++)
       {
          if(z[i]!=0)
          {
               System.out.print(z[i]+" ");
          }
       }
 } 
    public static void main(String args[])
    {
        int x[]={2,3,1,28,4,5,4,4,5,6};
        int y[]={5,78,9,23,6,3,44,3,4,4,4,4,4,6,5,5,5 };
        union(x,y);
    }
}
