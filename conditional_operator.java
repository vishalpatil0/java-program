import java.util.*;
import static java.lang.System.out;
class conditional_operator
{
	public static void main(String args[])
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		out.println("Enter the value for x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		z=(x>y)?x:y;
		out.println("Greater number is"+z);
	}
}