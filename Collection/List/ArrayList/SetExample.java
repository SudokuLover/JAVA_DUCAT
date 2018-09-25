import java.util.ArrayList;

class SetExample{
	
	public static void main(String args[])
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		System.out.println("ArrayList before update"+ arrayList);
		
		arrayList.set(0, 11);
		arrayList.set(1,22);
		arrayList.set(2,33);
		arrayList.set(3, 44);
		
		System.out.println("ArrayList After update"+ arrayList);
		
	}
}