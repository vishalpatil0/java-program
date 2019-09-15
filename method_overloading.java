import java.util.*;
import static java.lang.System.out;
class method_overloading
{
	public int sum(int x,int y)
		{
			return (x+y);
		}
		public int sum(int x,int y,int z)
		{
			return (x+y+z);
		}
	public static void main(String args[])
	{
		method_overloading s=new method_overloading();
		out.println(s.sum(10,20));
		out.println(s.sum(10,20,30));
	}
}
		