import java.util.*;

public class MyArrayList<T> implements Iterator{
	
	int size1;
	Object object[];
	float growth=0.5f;
	int index=-1;
	int next=0;
	
	public MyArrayList( )
	{
		size1=10;
		object = new Object[5];
	}
	
	
	public MyArrayList(int size1)
	{
		this.size1=size1;
		object = new Object[5];	
	}
	
	public void add (T obj)
	{
		System.out.println(obj.getClass().getName());
		
		if(index+1==size1)
		{
			int tempSize = size1 + (new Float(size1*growth)).intValue();
			Object temp[]= new Object[tempSize];
			size1=tempSize;
			
			for(int i=0;i<object.length;i++)
			{
				temp[i]=object[i];
			}
			object=temp;
		}
		object[++index]=obj;
	}
	
	public void addAll(T o[])
	{
		for(int i=0;i<o.length;i++)
		{
			add(o[i]);
		}
	}
	
	public boolean set(int i,T obj){
		if(i<0) return false;
		else if (i<index)
		{
			add(obj);
			return true;
		}
		else{
			object[i]=obj;
			return true;
		}
	}
	
	public String toString(){
		String str="";
		for(int i=0;i<=index;i++)
		{
			str +="{"+object[i].toString()+"}";
		}
		return str;
	}
	
	public int size(){
		return index+1;
	}
	public void remove(){
		index--;
	}
	public boolean isEmpty(){
		return index==-1;
	}
	public int capacity(){
		return object.length;
	}
	
	public Object next(){
		return object[next++];
	}
	public boolean hasNext(){
		if(next>index)
			return false;
		else 
			return true;
	}
	
	Iterator iterator(){
		return this;
	}
}