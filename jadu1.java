import static java.lang.System.out;
import java.util.*;
class inhr
{
	public
	static int a=10;
	public static void display()
	{
		out.println(a);
	}
}
class asd extends inhr
{	static int b=20;
	public static void display()
	{
		   
			out.println(a);
			out.println(b);
	}
}
class jadu1
{
	public static void main(String args[])
	{   inhr b=new inhr();
		b.display();
		asd a=new asd();
		a.display();
		
	}
}
		