import java.util.*;
import static java.lang.System.out;
class a
{
	void show()
	{
		out.println("this is class a");
	}
}
class b extends a
{
	void show()
	{
		out.println("this is class b");
	}	
}
class c extends a
{
	void show()
	{
		out.println("this is class c");
	}
}
class method_overide
{
	public static void main(String args[])
	{
		a a1=new a();
		a1.show();
		b b1=new b();
		b1.show();
		c c1=new c();
		c1.show();
	}
}