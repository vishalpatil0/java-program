import static java.lang.System.out;
import java.util.*;
class arrray1
{
	public static void main(String args[])
	{
		int arr[],i,n,cnt=0;
		Scanner sc=new Scanner(System.in);
		out.println("enter the limit of array");
		n=sc.nextInt();
		arr=new int[n];
		out.println("enter the elsement in array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				cnt++;
			}
				
		}
		out.println("\nThere are "+cnt+" elements in array which are divided by 2");
	}
}
		
		