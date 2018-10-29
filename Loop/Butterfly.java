
public class pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		
			
			for(int j=20-4*i;j>=1;j--)
			{
				System.out.print(" ");
			}
			
			for(int l=i;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
			
			
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<5-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(j);
			}
		
			for(int j=1;j<=4*i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=5-i;j>=1;j--)
			{
				System.out.print(j);
			}
		
			System.out.println();
			
		}

	}

}
