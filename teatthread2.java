class demo extends Thread
{
	String arr[];
	int sum=0;
	public demo(String arr[])
	{
		this.arr=arr;
	}
	public void run()
	{
		displaysum();
	}
	public void displaysum()
	{
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	sum=sum+Integer.parseInt(arr[i]);
	}
	System.out.println("sum of "+arr.length+"elements are:"+sum);
	}
}
class testthread2
{
	public static void main(String args[])
	{
		Demo t1=new Demo(args);
		t1.start();
	}
}