class Demo extends Thread
{
String arr[];
int sum=0;
	public Demo(String arr[])
	{
	this.arr=arr;
	}
	public void run()
	{
	displaySum();
	}
	public void displaySum()
	{
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	sum=sum+Integer.parseInt(arr[i]);
	}
System.out.println
("Sum of "+arr.length
+" elements is :"+sum);
	}
}

class TestThread22
{
public static void main(String args[])
{
Demo t1=new Demo(args);
t1.start();
}
}	