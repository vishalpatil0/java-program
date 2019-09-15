import java.io.*;
import java.util.*;
import static java.lang.System.out;
class exception_3
{
	static void pro1()
	{
		try
		{
			out.println("inside method pro1");
			throw new RunTimeException("vishal");
		}
		finally
		{
			out.println("finally block of  pro1");
		}
	}
	static void pro2()
	{
		try
		{
			out.println("inside method pro2");
			return;
		}
		finally
		{
			out.println("finally block of  pro2");
		}
	}
	static void pro3()
	{
		try
		{
			out.println("inside method pro3");
			return;
		}
		finally
		{
			out.println("finally block of  pro3");
		}
	}
	public static void main(String args[])
	{
		try
		{
			pro1();
		}
		catch(Exception e)
		{
			out.println(e);
		}
		pro2();
		pro3();
		out.println("best luck");
	}
}
	
			