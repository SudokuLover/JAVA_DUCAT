class Q28printTriangleWise{

    static void printTriangleWise(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<=i;j++){
             System.out.print(a[j]+" ");   
            }
            System.out.print("\n");
        }

    }

    public static void main(String args[])
    {
        int a[] = {1, 2, 3, 4, 5};
        printTriangleWise(a);
    }
}
