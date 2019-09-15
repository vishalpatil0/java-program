import java.util.*;
import java.io.*;

public class Demo10 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter zero to exit");
		int ch=sc.nextInt();
		if(ch==0)
		{
			System.exit(0);
		}
		int n1,n2;
		
		System.out.println("Enter value for number one");
		n1=sc.nextInt();
		System.out.println("Enter value for number two");
		n2=sc.nextInt();
		System.out.println("Addition is="+(n1+n2));
		
	}
}