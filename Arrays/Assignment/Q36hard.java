//hardest question of the week
class Q36hard{
static int x=0,k=0,max=-9999999;

public static void main(String args[]){

int y[]= {123,234,345,456,567,789};

for(int i=0;i<y.length;i++)
{
    if(max<=y[i])
        max=y[i];
}
    int k=max;
    while(max!=0)
    {
        if(max%2!=0)
        {
            x++;
            max--;
        }
        else{
            x++;
            max/=2;
        }
    }
    for(int i=0;i<y.length;i++){
        if(y[i]!=k)
        {   
            while(y[i]!=0)
            {
                if(y[i]%2!=0)
                {
                    x++;
                    y[i]--;
                }
                else{

                    y[i]/=2;
                }
            
             }
    }
        
    }

System.out.println(x);

}




}
