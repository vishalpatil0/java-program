import java.util.*;
public class st3
{
	static int n1,n2,add,sub;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number one");
		n1=sc.nextInt();
		System.out.println("Enter the value of number one");
		n2=sc.nextInt();
		st3 s1=new st3();
		s1.add(n1,n2);
		int g=sub(n1,n2);
		System.out.println("Subtraction is"+g);
	}
	public static void add(int x,int y)
	{
		add=x+y;
		System.out.println("Addition is"+add);
	}
	public static int sub(int x,int y)
	{
		return(x-y);
	}
}
