import static java.lang.System.out;
import java.util.*;
class tp
{
	public static void main(String args[])
	{
		float a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
		out.println(a+"+"+b+"="+(a+b));
		out.println(a+"%"+b+"="+(a%b));
		if(a>b && a/b==2)
		{
			out.print("a");
		}
	}
}