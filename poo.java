import java.util.*;
import static java.lang.System.out;
class poo
{
	public static void main(String args[])
    {
		calc();
    }
	public static void calc()
	{
		int arr[],i;
        
        out.println("Enter the limit of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		arr=new int[n];
		out.println("Enter the element in  array");
       	for(i=0;i<arr.length;i++)
		{
            arr[i]=sc.nextInt();
        }
		out.println("array is");
        for(i=0;i<arr.length;i++)
		{
			out.println(arr[i]);
        }
		
	}
}
 		