import static java.lang.System.out;
import java.util.*;
class ifelseladder
{
	public static void main(String args[])
	{
		int a;
		out.println("enter the percentage");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a>=75)
		{
			out.println("A grade");
		}
		else if(a>=50)
		{
            out.println("b grade");
		}
		else if(a>=35)
		{
            out.println("c grade");
		}
		else
		{
			out.println("d grade");
		}
	}
}
			