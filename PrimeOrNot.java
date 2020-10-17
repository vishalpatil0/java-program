import java.util.Scanner;
class PrimeOrNot
{
	public static void main(String args[])
    {
		byte flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number here : ");
		short n=sc.nextShort();
		for(short i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(n == 1) {
			System.out.println("1 is neither prime nor composite.");
		}
		else if(flag==0)
		{
			System.out.format("%d is not a prime nubmer\n",n);
		}
		else
		{
			System.out.format("%d is a prime nubmer\n",n);
		}
	}
}