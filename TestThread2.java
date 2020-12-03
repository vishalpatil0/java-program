class Demo extends Thread
{
	String str;
	public Demo(String str)
	{
		this.str=str;
	}
	public void run()
	{
		System.out.println("Running");
		System.out.println("Passed string is:"+str);
	}
	//dead
}
class TestThread2
{
	public static void main(String args[])
	{
		Demo d1=new Demo("Java");
		d1.start();
	}
}