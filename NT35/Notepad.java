class Notepad{

	public static void main(String ...s){
	
		Runtime rt= Runtime.getRuntime();
		try{
			rt.exec("notepad.exe");
			rt.exec("C:\\Program Files (x86)\\Microsoft Office\\Office14\\WINWORD.EXE");	
		}
		catch(Exception e){
		
			System.out.println(e);
		}
		System.out.println("hello");
	}


}