import java.io.*;
class Files2
{
public static void main(String args[])throws NullPointerException
{	
String dirName="E:\\test111";
File f = new File(dirName,"work.txt");
System.out.println("File name is:" +f.getName());
System.out.println("Path of the file is:" +f.getPath());
System.out.println("Parent directory is:" +f.getParent());
System.out.println("Listing the contents of directory");
File f1 = new File("E://test111");
String s[]=f1.list();
for(int i = 0;i<s.length;i++)
{
	System.out.println(s[i]);
}
}
}

