class Q23binaryToDecimal
{
    static void binaryToDecimal(int a[])
    {
        int i = 1;
        int j = 0;
        for(int k = 0; k < a.length; k++)
        {
            j+= a[k] * i;
            i*= 2;
        }

        System.out.print(j);
    }

    public static void main(String args[])
    {
        int a[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        binaryToDecimal(a);
    }
}
