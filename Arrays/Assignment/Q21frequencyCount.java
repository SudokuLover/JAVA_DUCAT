class Q21frequencyCount
{
    static void frequencyCount(int a[])
    {
        
        for(int j=0;j<a.length;j++)
        {
           int  i=1;
            if(a[j] == 0)
                continue;
            for(int k=j+1;k<a.length-1;k++)
                if(a[j] == a[k])
                {
                    a[k] = 0;
                    i++;
                }
                  System.out.println("value is  "+a[j]+" its frequency is "+ i);

        }

    }

    public static void main(String args[])
    {
        int a[] = {9, -5, -8, 6, 6, 6, 6, 6, 6, -2, 4, 4, 4, 4, 4, 4, -7, -4, 1, 1, 1, 1, 1, 1, 7, 6, 3, 2};
        frequencyCount(a);
    }
}
