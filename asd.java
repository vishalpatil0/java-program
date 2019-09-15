import java.util.*;
class asd
{
	public static void main(String args[])
    {
		int n,i,flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nENter the value");
		n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(n+"\nit is not prime");
		}
		else
		{
			System.out.println("\nprime");
		}
	}
}