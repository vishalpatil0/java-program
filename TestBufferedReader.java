//BuffredReader and InputStreamReader
import java.io.*;
class TestBufferedReader
{
	public static void main(String args[]) throws Exception
	{
InputStreamReader itr=
new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(itr);
	System.out.println("Enter RegNo,Name,Perct");
	String s1=br.readLine();//101
	int rno=Integer.parseInt(s1);
	String name=br.readLine();
	float per=Float.parseFloat(br.readLine());
System.out.println("Reg NO "+rno);
System.out.println("Name :"+name);
System.out.println("Perct :"+per);
	}
}