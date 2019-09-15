import java.io.*;
import java.util.*;
import static java.lang.System.out;
class exception_2
{
	public static void main(String args[])
	{
		 out.println("hello1");
		 try
		 {
			 int n1=Integer.parseInt(args[0]);
			 int n2=Integer.parseInt(args[1]);
			 out.println("hello2");
			 int ans=n1/n2;
			 out.println("ans is ="+ans);
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
			 out.println("ty");
		 }
		 out.println("tysm--------!");
		 }
	}
}