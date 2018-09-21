class Q24maxInOneRow{

    static void maxInOneRow(int a[][])
    {
     int y=0;
        for(int i=0;i<a.length;i++)
        {
            y=-11100;
            for(int j=0;j<a[i].length;j++)
            {
                if(y<a[i][j])
                    y=a[i][j];
            }
            System.out.println("max in row "+(i+1)+"is "+ y);
        }
    }

    public static void main(String args[])
    {
        int x[][] = {{8,2,3},{7,5,1},{4,50,10}};
        maxInOneRow(x);
  
    }
}
