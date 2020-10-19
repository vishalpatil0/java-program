import static java.lang.System.out;
class Exception_MultipleCatch
{
	public static void main(String args[])
	{
		try
		{
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			int ans=n1/n2;
			out.println("Addition is ="+ans);
		}
		catch(ArithmeticException e)
		{
			out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			out.println(e);
		}
		catch(Exception e)
		{
			out.println(e);
		}
		finally
		{
			out.println("Finally Block");
		}
		out.println("Out of finally block");
	}
}