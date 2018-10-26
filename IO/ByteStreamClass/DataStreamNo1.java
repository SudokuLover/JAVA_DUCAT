import java.io.*;

class DataStreamNo1{
	public static void main(String... args)throws IOException{
		FileOutputStream fout = new FileOutputStream("NurtureClasses.txt");
		DataOutputStream dout = new DataOutputStream(fout);
		
		dout.writeInt(10);
		dout.writeLong(101);
		dout.writeBoolean(true);
		dout.writeDouble(10.9);
		dout.close();
		
		FileInputStream fr = new FileInputStream("NurtureClasses.txt");
		DataInputStream din = new DataInputStream(fr);
			
			int i=din.readInt();
			long l= din.readLong();
			boolean b= din.readBoolean();
			double d= din.readDouble();
			System.out.println(i);
			System.out.println(l);
			System.out.println(b);
			System.out.println(d);
	}
	
}