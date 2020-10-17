public class okjo
{
	public static void main(String args[])
	{
		int arr[]={1,2,33,4,5};
		
		int temp=Integer.MIN_VALUE;System.out.println(temp);
		short tem=Short.MIN_VALUE;System.out.println(tem);

		for(int i:arr)
		{
			if(temp<i)
			{
				temp=i;
			}
		}System.out.println(temp);
		temp=Integer.MAX_VALUE;System.out.println(temp);
		for(int i:arr)
		{
			if(temp>i)
			{
				temp=i;
			}
		}
		System.out.println(temp);
	}
}
