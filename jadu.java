import static java.lang.System.out;
import java.util.*;
class inhr
{
	public
	static int a=10;
	public static void loop()
	{
		for(a=10;a<=20;a++)
		out.println(a);
	}
	
}
class asd extends inhr
{
	public static void display()
	{
		   
		out.println(a);
	}
}
class jadu
{
	public static void main(String args[])
	{
		asd a=new asd();
		a.display();
		inhr b=new inhr();
		b.loop();
	}
}
		