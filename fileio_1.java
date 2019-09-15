import java.io.*;
class fileio_1
{
 public static void main(String args[]) throws Exception
 {
  FileInputStream fin=new FileInputStream("F:\\java\\add.java");
  FileOutputStream fout=new FileOutputStream("F:\\abc.txt");
  int ch;
  while((ch=fin.read())!=-1)
  {
   fout.write(ch);
   System.out.print((char)ch);
  }
   System.out.println("\n\n\nfile copy");
 }
}
   