class Q22firstNonRepeatingDigit{
    
    static void firstNonRepeatingDigit(int a[])
    {
        for(int i = 0; i < a.length; i++)
        {
            int k = 1;
            if(a[i] == 0)
                continue;
            for(int j = i+1;j< a.length-1;j++)
                if(a[i] == a[j])
                {
                    a[j] = 0;
                    k++;
                }

            if(k!= 1)
                continue;
            System.out.println("firstNonRepeatingDigit is   "+a[i]);
            break;
        }

    }

    public static void main(String args[])
    {
        int a[] = {1,1,1,1,19,-5,-8,6,6,6,6,6,6,-2,4,4,4,9,4,4,-7,-4,1,1,1,1,1,1,7,6,3,2};
        firstNonRepeatingDigit(a);
    }
}
