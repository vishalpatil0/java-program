import java.io.*;
class fileio_3
{
 public static void main(String args[]) throws IOException
 {
   FileInputStream fin=new FileInputStream("F:\\java\\allconst.java");
   FileOutputStream fout=new FileOutputStream("D:\\vishal.txt");
   int ch;
   while((ch=fin.read())!=-1)
	{
	  fout.write(ch);
	  System.out.print((char)ch);
	}
  }
}
	
   
 