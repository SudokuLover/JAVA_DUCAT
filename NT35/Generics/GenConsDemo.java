//local variable is generic
class GenCons{
	
	private double var;
	
	<T extends Number> GenCons(T arg)
	{
		var=arg.doubleValue();
	}
	void showVar(){
		System.out.println(" var: "+var);
	}
	
}
public class GenConsDemo{
	public static void main(String ...args){
	
		//GenCons test1 = new GenCons('a');
		GenCons test = new GenCons(100);
		GenCons test2 = new GenCons(123.5f);
	
		test.showVar();
		test2.showVar();
	}
	
}
