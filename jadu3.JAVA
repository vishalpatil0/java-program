import static java.lang.System.out;
import java.util.*;
class inhr
{
	public
	static int a=10;
	
}
class asd extends inhr
{	
    public
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
	
class multiple_inheritance
{
	public static void main(String args[])
	{   
	
	   bcd x=new bcd();
	   x.add();
		
	}
}
		