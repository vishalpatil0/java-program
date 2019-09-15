import static java.lang.System.out;
import java.util.*;
abstract class inhr
{
	protected
	static int a=10;
	
}
abstract class asd extends inhr
{	
    protected
    static int b=20;
	
}
 class bcd extends asd
{
	
	static int c;
	public static void add()
	{
	c=a+b;
	out.println(a);
	out.println(b);
	out.println("add is"+c);
	}
}
	
class tp3
{
	public static void main(String args[])
	{   
	
	   bcd x=new bcd();
	   x.add();
		
	}
}
		