import java.util.Scanner;
import static java.lang.System.out;
class PrintingReverseArray
{
	public static void main(String args[])
	{
		int arr[],n;
		Scanner sc=new Scanner(System.in);
		out.println("Enter the limit of array");
		n=sc.nextInt();
		arr=new int[n];
		out.println("Enter the elements in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--)
		{
			out.println(arr[i]);
		}
	}
}
		
			