class Demo extends Thread
{
String str;
	public Demo(String str)
	{
	this.str=str;
	}
	public void run()
	{
	System.out.println("Running...");
	}
	//Dead...
}
class TestThread1
{
	public static void main(String args[])
	{
	Demo t1=new Demo();//Create
	t1.start();//Runnable...
	System.out.println("Thank you...");
	}
}