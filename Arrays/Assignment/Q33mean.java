class Q33mean{

    static int mean(int a[])
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            c+=a[i];
        }
        c=c/a.length;
        return c;
    }

    public static void main(String args[])
    {
        int x[] = {1, 2, 3, 4, 5};
       int p= mean(x);
        System.out.println(p);
    }
}
