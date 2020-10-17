public class okjo
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		System.out.println("helllow");
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
		{
			if(i<j)
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			}
		}
		for(int g:arr)
		{
			System.out.println(g);
		}
	}
}
