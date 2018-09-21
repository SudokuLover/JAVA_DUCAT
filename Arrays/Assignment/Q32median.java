class Q32median{
 static float median(int a[])
 {
     float k=0;
     int l=a.length;
     if(l%2!=0)
     {
      k=a[l/2];   
     }
     else{
         l=l/2;
         k=a[l]+a[l+1];
         k/=2;
     }
     return k;
 }
  
    public static void main(String args[])
    {
       
        int x[]={1,2,3,4,5,6};
        float q=median(x); 
        System.out.print(q);
    }
}
