import static java.lang.System.out;
import java.util.*;
class inhr
{
	public
	static int a=10;
	public static void display(int x)
	{	a=x;
		out.println(a);
	}
}
class asd extends inhr
{	static int b=20;
	
}
class jadu2
{
	public static void main(String args[])
	{   
	
		asd a=new asd();
		a.display(23);
		
	}
}
		