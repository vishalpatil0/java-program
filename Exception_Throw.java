import static java.lang.System.out;
class Exception_Throw
{
	static void pro1()
	{
		try
		{
			out.println("Method Name: pro1() is called");
			throw new ArrayIndexOutOfBoundsException("Vishal");
		}
		finally
		{
			out.println("Finally block of  pro1");
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
			out.println("Exception thrown by pro1() method = "+e);
		}
		pro2();
		pro3();
		out.println("best luck");
	}
}
	
			