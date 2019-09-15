import java.util.*;
class swapping
{
	public static void main(String args[])
	{
		 int a,b,temp;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("\nenter the values");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 System.out.println("\nbefore swappinga="+a+"b="+b);
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.println("\nafter swappinga="+a+"b="+b);
	}
}