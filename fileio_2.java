import java.io.*;
class fileio_2
{
 public static void main(String args[]) throws Exception
 {
	 FileInputStream fin=new FileInputStream("E:\\Data.txt");
  DataInputStream din=new DataInputStream(fin);
  int ch;
  while((ch=din.readInt())!=-1)
  {
	  
  System.out.println(ch);
  }
 }
}