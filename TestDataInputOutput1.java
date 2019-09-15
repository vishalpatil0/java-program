import java.io.*;
class TestDataInputOutput1
{
	public static void main(String args[]) throws Exception
	{
FileOutputStream fout=new FileOutputStream("E:\\Data.txt");
DataOutputStream dout=new DataOutputStream(fout);

dout.writeInt(101);
dout.writeFloat(1.1f);
dout.writeBoolean(true);
System.out.println("Primitive Type Data Save in File");

FileInputStream fin=new FileInputStream("E:\\Data.txt");
DataInputStream din=new DataInputStream(fin);

int n=din.readInt();
float f=din.readFloat();
boolean b=din.readBoolean();
System.out.println(n+"\t"+f+"\t"+b);
	




	}
}