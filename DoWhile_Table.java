import static java.lang.System.out;
import java.util.*;
class DoWhile_Table
{
	public static void main(String args[])
	{
		int i,n;
		out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		n=1;
		out.println("Table of "+i+" is as follow");
		do
		{
			out.format("%d * %d  = %d\n",i,n,i*n);	
			n++;
		}while(n<11);
	}
}