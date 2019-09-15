import static java.lang.System.out;
import java.util.*;
class prime1
{
	public static void main(String args[])
	{
		int flag=0;
		int n;
		Scanner sc=new Scanner(System.in);
		out.println("enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			 if(n%i==0)
			 {
				 flag=1;
			     break;
			 }
		}
		if(flag==0)
		{
			out.println("not a prime number");
		}
		else
		{
			out.println("prime number");
		}
	}
}
		