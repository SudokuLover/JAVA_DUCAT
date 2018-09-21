class Q7mergeSort{
    
 static void mergeSort(int a[],int b[]){
     
   int z[]=new int [a.length+b.length];
     for(int i=0;i<a.length;i++)
     {
         z[i]=a[i];
     }
     for(int i=a.length;i<z.length;i++)
     {
         z[i]=b[i-a.length];
     }
     

    for(int i=0;i<z.length;i++)
        {
            for(int j=0;j<z.length-1;j++)
            {
               if(z[j]>z[j+1])
               {
                   int k=z[j];
                  z[j]=z[j+1];
                   z[j+1]=k;
               }
              
            }
        }
       for(int i=0;i<z.length;i++)
       {
               System.out.print(z[i]+" ");
       
       }
 } 
    public static void main(String args[])
    {
        int x[]={2,1,28,4,5,6};
        int y[]={78,9,23,6,44,3};
        mergeSort(x,y);
    }
}

