import java.io.*;
class TestFileInputOutput
{
	public static void main(String args[]) throws Exception
	{
	int ch;
FileInputStream fin=
     new FileInputStream("E:\\Name.txt");
FileOutputStream fout=
     new FileOutputStream("E:\\newname.txt");
	while((ch=fin.read())!=-1)
	{
		fout.write(ch);
		System.out.print((char)ch);
	}	
      }
}