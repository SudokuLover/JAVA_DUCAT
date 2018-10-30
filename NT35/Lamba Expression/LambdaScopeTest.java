import java.util.function.Consumer;
public class LambdaScopeTest{
	
	private int x=0;
	
	class FirstLevel{
		public int x=1;
		
		void methodInFirstLevel(int x){
			
			Consumer<Integer> myConsumer=(y)->{
				System.out.println("X= "+x);
				System.out.println("Y= "+y);
				System.out.println("this.X= "+this.x);
				System.out.println("LambdaScopeTest.this.X= "+LambdaScopeTest.this.x);
			};
			
			myConsumer.accept(x);
		}
	}
	public static void main(String ...str) throws Exception{
		
		LambdaScopeTest st = new LambdaScopeTest();
		LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
		
		fl.methodInFirstLevel(23);
	}
}
