class Q31Find3rdLargestValue{

    static void Find3rdLargestValue(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int o=0;
            int k=a[i];
            for(int j=0;j<a.length;j++)
            {
             if(k<a[j])
                 o++;
            }
            if(o==2)
            {
              System.out.print(a[i]);
                break;
            }
         }

    }

    public static void main(String args[])
    {
        int x[] = {1, 2, 3, 4, 5};
        Find3rdLargestValue(x);
    }
}
