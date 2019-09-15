import java.io.*;
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
		displaysum();
	}
	public void displaysum()
	{
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
			 sum=sum+Integer.parseInt(arr[i]);
		 }
		 System.out.println("Sum of "+arr.length+"element is:"+sum);
	}
}
class TestThread1
{
	public static void main(String args[])
	{
		Demo t1=new Demo(args);
		t1.start();
	}
}