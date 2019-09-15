import java.util.*;
import static java.lang.System.out;
class arr1
{
	public static void main(String args[])
	{
		int arr[],n;
		Scanner sc=new Scanner(System.in);
		out.println("enter the limit of array");
		n=sc.nextInt();
		arr=new int[n];
		out.println("enter the elt in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=n;i>0;i--)
		{
			out.println(arr[i]);
		}
	}
}
		
			