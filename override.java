import static java.lang.System.out;
import java.util.*;
class data1
{
	int x;
	data1(int x)
	{
		this.x=x;
	}
	void display()
	{
		out.println("value of x is"+x);
	}
}
	class sub extends data1
{
	int y;
	sub(int x,int y)
	{
	super(x);
	this.y=y;
	}
	void display()
	{
	out.println("super x="+x+"\nsub y="+y);
	}
}
class override
{
public static void main(String args[])
{
	sub s1=new sub(10,30);
	s1.display();
}
}
	