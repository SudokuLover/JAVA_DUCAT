class MagicNum{

    static int MagicNum(int a)
    {
        int sum=0,k;
        if(a<10)
            return a;
        else
        {
            while(a!=0)
            {
                sum+=a%10;
                a/=10;
            }
           k= MagicNum(sum);
        }
        return k;
    }
    

    public static void main(String args[])
    {
        int x=199;
        int p= MagicNum(x);
         if(p==1)
         {
             System.out.println("magic num");
         }
        else{
            System.out.println("not a magic num");
        }
    }
}

