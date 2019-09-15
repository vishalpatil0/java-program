import java.io.*;
class fileio_primitive_datatype
{
 public static void main(String args[]) throws Exception
 {
   FileOutputStream fout=new FileOutputStream("E:\\Data.txt");
   DataOutputStream dout=new DataOutputStream(fout);
   dout.writeInt(101);
   dout.writeFloat(1.1f);
   dout.writeBoolean(true);
   System.out.println("Primitive types save in file");
   FileInputStream fin=new FileInputStream("E:\\Data.txt");
   DataInputStream din=new DataInputStream(fin);
   int n=din.readInt();
   Float f=din.readFloat();
   Boolean b=din.readBoolean();
   System.out.println(n+"\t"+f+"\t"+b);
 }
}
   
      
   