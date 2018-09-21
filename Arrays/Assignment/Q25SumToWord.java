class Q25SumToWord{
    static void word(int z)
    {
        
             switch(z)
        {
                case 1:System.out.print("one ");
                    break;
                case 2:System.out.print("two ");
                    break;
                case 3:System.out.print("three ");
                    break;
                case 4:System.out.print("four ");
                    break;
                case 5:System.out.print("five ");
                    break;
                case 6:System.out.print("six ");
                    break;
                case 7:System.out.print("seven ");
                    break;
                case 8:System.out.print("eight ");
                    break;
                case 9:System.out.print("nine ");
                    break;
                case 10:System.out.print("ten ");
                    break;
                case 11:System.out.print("eleven ");  
                    break;
                case 12:System.out.print("twelve ");
                    break;
                case 13:System.out.print("thirteen ");
                    break;
                case 14:System.out.print("fourteen ");
                    break;
                case 15:System.out.print("fifteen ");
                    break;
                case 16:System.out.print("sixteen ");
                    break;
                case 17:System.out.print("seventeen ");
                    break;
                case 18:System.out.print("eighten ");
                    break;
                case 19:System.out.print("nineteen ");
                    break;
                case 20:System.out.print("twenty ");
                    break;
                case 30:System.out.print("thirty ");
                    break;
                case 40:System.out.print("forty ");
                    break;
                case 50:System.out.print("fifty ");
                    break;
                case 60:System.out.print("sixty ");
                    break;
                case 70:System.out.print("seventeen ");
                    break;
                case 80:System.out.print("eigthy ");
                    break;
                case 90:System.out.print("ninty ");
                    break;
        }
    }

    static void  SumToWord(int a[])
    {
        int k=a.length;
         int i=k;      
         while(k!=0)
        {
            if(k==10)
            {
                word(a[i-k]);
                System.out.print("hundred ");
                k-=1;
            }
            if(k==9)
            {
                int u=a[i-k+1]+a[i-k]*10;
                if(u<=20)
                {
                 word(u);   
                }
                else{
                    int r=u%10;
                    u=u-r;
                    word(u);
                    word(r);
                }
                System.out.print("crore ");
                k-=2;
            }
             if(k==8)
             {
                 word(a[i-k]);
                 System.out.print("crore ");
                 k--;
             }
             if(k==7)
             {
                  int u=a[i-k]*10+a[i-k+1];
                if(u<=20)
                {
                 word(u);   
                }
                else{
                    int r=u%10;
                    u=u-r;
                    word(u);
                    word(r);
                }
                System.out.print("lakhs ");
                k-=2;
             }
             if(k==6)
             {
                   word(a[i-k]);
                 System.out.print("lakhs ");
                 k--;
             }
             if(k==5)
             {
                int u=a[i-k]*10+a[i-k+1];
                if(u<=20)
                {
                 word(u);   
                }
                else{
                    int r=u%10;
                    u=u-r;
                    word(u);
                    word(r);
                }
                System.out.print("thousand ");
                k-=2;
             }
             if(k==4)
             {
                    word(a[i-k]);
                 System.out.print("thousand ");
                 k--;
             }
             if(k==3)
             {
                    word(a[i-k]);
                 System.out.print("hundred ");
                 k--;
             }
             if(k==2)
             {
                         int u=a[i-k]*10+a[i-k+1];
                if(u<=20)
                {
                 word(u);   
                }
                else{
                    int r=u%10;
                    u=u-r;
                    word(u);
                    word(r);
                }
                System.out.print("only ");
                k-=2;
             }
        }
    }
    
    public static void main(String args[])
    {
        int x[]={1,2,3,4,5,6,7,8,9};
         SumToWord(x);
    }
}

