import static java.lang.System.out;
import java.util.*;
class while1
{
	public static void main(String args[])
	{
		int i,n;
		out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		n=1;
		out.println("table of "+i+" is");
		while(n<11)
		{
			out.println((i*n));	
			n++;
		}
	}
}