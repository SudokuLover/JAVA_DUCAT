import java.util.*;

class MyDeleteKeyObject{
	public static void main(String args[])
	{
		HashMap<Price,String> hm = new HashMap<>();
		System.out.println(hm.size());
		System.out.println("is HashMap isEmpty?"+ hm.isEmpty());
		hm.put(new Price("Banana",30),"Banana");
		hm.put(new Price("Apple",20),"Apple");
		hm.put(new Price("Orange",40),"Orange");
		hm.put(new Price("Apple",41),"Mango");
		printMap(hm);
	
		Price key= new Price("Banana",30);

		System.out.println("does any key available?"+hm.containsKey(key));
		System.out.println("does any value available?"+hm.containsValue("Banana"));
		System.out.println("deleting key.....");
		hm.remove(key);
		
		System.out.println("after deleting key.....");
		printMap(hm);
	}
	public static void printMap(HashMap<Price,String> map)
	{
		Set<Price> s = map.keySet();
		for(Price p : s)
		{
			System.out.println(p+ "  ===>  "+map.get(p));
		}
		
	}
}

class Price{
	private String item;
	private int price;
	Price(String item , int price)
	{
		this.item=item;
		this.price=price;
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("in equals");
		if(obj instanceof Price)
		{
			Price pp =(Price)obj;
			return (pp.item.equals(this.item) && pp.price==this.price );	
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{	
		System.out.println("in hash code");
		int hashcode=0;
		hashcode=price*20;
		hashcode += item.hashCode();
		return hashcode;
		
	}
	
	@Override
	public String toString(){
		return "item"+item+ "price:"+price;
	}
}