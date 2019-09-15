import java.io.*;
public class TestFileInputOutputStream
{
public static void main(String args[])  throws Exception
{
FileInputStream fin=
new FileInputStream("E:\\Welcome1.java");

FileOutputStream fout
=new FileOutputStream("E:\\xyz1.txt");

int ch;
	while((ch=fin.read())!=-1)
	{
		fout.write(ch);
		System.out.print((char)ch);
	}
	System.out.println("File Copy...");
	}
}