import static java.lang.System.out;
import java.util.*;
class allconstructors
{

		int a,b;
		allconstructors()
		{
			out.println("it is default constructor");
		}
	    allconstructors(int x, int y)
		{
			a=x;
			b=y;
		}
		allconstructors(allconstructors obj)
		{
			a=obj.a;
			b=obj.b;
		}
		void show()
		{
			out.println("a is"+a);
			out.println("b is"+b);
		}
}
class demoo
{
	public static void main(String args[])
	{
		allconstructors a1= new allconstructors();
		allconstructors a2= new allconstructors(4,5);
		a2.show();
		allconstructors a3= new allconstructors(a2);
	    a3.show();
	}
}
		
		
    