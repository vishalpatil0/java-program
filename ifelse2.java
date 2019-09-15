import static java.lang.System.out;
import java.util.*;
class ifelse2
{
	public static void main(String args[])
	{
		int a;
		out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%2==0)
		{
			out.println("it is even");
		}
		else
		{
            out.println("it is odd");
		}
	}
}
			