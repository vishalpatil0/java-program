import static java.lang.System.out;
import java.util.*;
class supers
{
 int x;
 supers(int x)
 {
   this.x=x;
 }
 void display()
 {
	 out.println("Value of x is:"+x);
 }
}
class duper extends supers
{
	int y;
	duper(int x,int y)
	{
		super(x);
		this.y=y;
	}
	void display()
	{
		out.println("x="+x+"y="+y);
	}
}
class override_1
{
	public static void main(String args[])
	{
		duper d1=new duper(10,20);
		d1.display();
	}
}
		