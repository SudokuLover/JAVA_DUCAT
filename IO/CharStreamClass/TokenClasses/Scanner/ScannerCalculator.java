import java.util.Scanner;
import java.io.IOException;

public class ScannerCalculator{
	
	public static void main(String args[])throws IOException{
		
		System.out.println("type Something like : 1 + 3");
		Scanner sc = new Scanner(System.in);
		double n1=0.0;
		double n2=0.0;
		String operation=null;
		
		try{
			n1=sc.nextDouble();
			operation = sc.next();
			n2=sc.nextDouble();
			
			double result=calculate(n1,n2,operation);
			System.out.printf("%s %s %s=%.2f %n",n1,operation,n2,result);
			
		}
		catch(Exception e)
		{
			System.out.println("AnInvalidOutput");
			
		}
		
	}
	public static double calculate(double n1,double n2,String operation){
		
		switch(operation){
			
			case "+": return n1+n2;
			
			case "-": return n1-n2;
			
			case "/": return n1/n2;
			
			case "*": return n1*n2;
		}
		
		return Double.NaN;
	}

}