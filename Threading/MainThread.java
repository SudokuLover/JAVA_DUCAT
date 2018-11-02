class MainThread {
	public static void main(String args[])
	{
		Thread t=  Thread.currentThread();
		System.out.println(t.getName());
		t.setName("main change");
		System.out.println(t.getName());
	}
	
}