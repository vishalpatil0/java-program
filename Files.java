import java.io.*;
class Files
{
	public static void main(String args[])throws NullPointerException
	{	
String dirName = "E://test111";
File f = new File(dirName, "work.txt");
File f3 = new File(dirName,"renFile.txt");
System.out.println("File name is:" +f.getName());
System.out.println("Path of the file is:" +f.getPath());
System.out.println("Parent directory is:" +f.getParent());
System.out.println("Listing the contents of directory");
File f1 = new File("E://test111");
String s[] = f1.list();
		for(int i = 0;i<s.length;i++)
		{
		File f2 = new File("\t" +dirName+ "/" +s[i]);
			if(f2.isDirectory())
			{
f2.delete();
System.out.println("\t" +s[i] + "is a directory");
			}
			else
			{
System.out.println("\t" +s[i] + "is a file");
			}
		}
	}
}
