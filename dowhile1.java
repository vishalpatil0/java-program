import static java.lang.System.out;
import java.util.*;
class dowhile1
{
	public static void main(String args[])
	{
		int i,n;
		out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		n=1;
		out.println("table of "+i+" is");
		do
		{
			out.println((i*n));	
			n++;
		}while(n<11);
	}
}