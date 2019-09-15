import java.io.*;
class TestGreater
{
	public static void main(String args[])
	{
try
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any three nos");
String a=br.readLine();
String b=br.readLine();
String c=br.readLine();
int x=Integer.parseInt(a);
int y=Integer.parseInt(b);
int z=Integer.parseInt(c);

int p=(x>y?(x>z?x:z):(y>z?y:z));

System.out.println("\n Greater :"+p);
}
catch(Exception e)
{
	System.out.println("Exception is :"+e);
}
	}
}