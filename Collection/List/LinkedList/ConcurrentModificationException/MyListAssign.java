import java.io.*;
//--Node

class Node{
	Object data;
	Node next;
}
//---Iterator
interface MyIterator{
	boolean hasNext();
	Object next();
}

//--- MyLinkedList

class MyLinkedList implements MyIterator{
	Node start = null;
	Node hsnxt,nxt;

	public MyIterator myIterator(){
		nxt=hsnxt=this.start;
		return this;
	}
	public boolean hasNext(){
		boolean flag=false;
		
		if(this.hsnxt!=null)
		{
			flag=true;
			this.hsnxt=this.hsnxt.next;
		}
		
		return flag;
	}
	
	public Object next(){
		Object o = nxt.data;
		nxt=nxt.next;
		return o;
	}
	public boolean isEmpty(){
		boolean flag=false;
		if(start==null)
		{
			flag=true;
		}
		return flag;
	}
	
	public void addFirst(Object o)
	{
		Node d=new Node();
		d.data=o;
		if(start==null)
		{
			start = d;
			d.next=null;
		}
		else {
			d.next=start;
			start=d;
		}
	}
	public void addLast(Object o)
	{
		Node d=new Node();
		d.data=o;
		d.next=null;
		if(start==null)
		{
			start = d;
		}
		else {
			Node var = start;
			while(var.next!=null)
			{
				var=var.next;
			}
			var.next=d;
		}
	}
	
	public Object getFirst(){
		return start.data;
	}
	public Object getLast(){
		Node var = start;
		while(var.next!=null)
		{
			var=var.next;
		}
		
		return var.data;
	}

	public Object removeFirst(){
		Object o=null;
		if(start!=null)
		{
			o=start.data;
			start=start.next;
		}
		return o;
	}

	public Object removeLast(){
		Object o=null;
		Node var = start;
		if(var.next==null)
		{
			start=null;
		}
		else if(var!=null)
		{
			while((var.next).next!=null)
			{
				var=var.next;
			}
			
			o=var.next.data;
			if(var.next==start)
			{
				start=null;
			}
			var.next=null;
		}
		return o;
	}
	
}


class MyListAssign{
	MyLinkedList element = new MyLinkedList();
	
	public static void  main(String...s) throws IOException
	{
		MyListAssign obj = new MyListAssign();
		
		int ch , ch1=0;
		String str;
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		for(;;)
		{
			System.out.println("Menu of the Operation for the DQ");
			System.out.println("1.Add\n2.Delete\n3.Display\n4.Exit");
			System.out.println("Enter Your Choice");
			ch=Integer.parseInt(sc.readLine());
			
			switch(ch)
			{
			case 1: for(;;)
					{
						obj.clrscr();
						System.out.println("Select the position for adding the new element");
						System.out.println("1.FRONT-END\n2.REAR-END\n3.BACK");
						System.out.println("Enter Your Choice");
						ch1=Integer.parseInt(sc.readLine());
						
						switch(ch1)
						{
						case 1:System.out.println("enter new string to insert");
								str = sc.readLine();
								obj.element.addFirst(str);
								break;
						case 2:System.out.println("enter new string to insert");
								str = sc.readLine();
								obj.element.addLast(str);
								break;
						case 3: 
								break;
						default:
								System.out.println("you have entered wrong choice");
						}
						if(ch1==3)
							break;
						
					}
					break;

			case 2: for(;;)
					{
						obj.clrscr();
						if(obj.element.isEmpty()==false)
						{
							System.out.println("Select the position to delete the  element");
							System.out.println("1.FRONT-END\n2.REAR-END\n3.BACK");
							System.out.println("Enter Your Choice");
							ch1=Integer.parseInt(sc.readLine());
							
							switch(ch1)
							{
							case 1:
								obj.element.removeFirst();
									break;
							case 2:
								obj.element.removeLast();
									break;
							case 3: 
									break;
							default:
									System.out.println("you have entered wrong choice");
							}	
						}
						else{
							System.out.println("sorry ! Nothing to delete");
							break;
						}
						if(ch1==3)
							break;
					}
					break;
			
			case 3 :
				if(obj.element.isEmpty()==false)
				{
					System.out.println("Content of the list");
					MyIterator it = obj.element.myIterator();
					while(it.hasNext())
					{
						System.out.println(it.next());
					}
				}
				else{
					System.out.println("sorry ! Nothing to display");
				}
			break;
	
			case 4: 
				System.exit(0);
			default: System.out.println("you have entered wrong choice");
			}
			
			System.out.println("wait getting back--------");
			
			try{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				obj.clrscr();
			}
			
		}
	}
	
	void clrscr(){
		for(int i=0;i<50;i++)
		{
			System.out.println("\n");
		}
	}
}