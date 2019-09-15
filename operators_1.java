import java.util.*;
import static java.lang.System.out;
class operators_1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    out.println("1-Arithmetic operator\n2-Relational Operator\n3-Logical opearator\n4-Assignment Operator\n5-Increment and decrement operator\n6-Conditional operator\n7-Bitwise operator\nSpecial operator");
		out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1: out.println("Arithmetic Operator is");
			        out.println("1+1:2");
			        out.println("1-1:0");
			        out.println("1*1:1");
			        out.println("1/1:1");
			        out.println("1%1:0");
					break;
		    case 2: out.println("Relational operator is");
			        out.println("2>1");
			        out.println("0<1");
			        out.println("1<=1");
			        out.println("1>=1");
			        out.println("1=1");
			        out.println("1!=0");
					break;
		   default:
		            out.println("Ty");
					break;
		}
	}
}