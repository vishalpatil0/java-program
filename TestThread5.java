class Demo extends Thread
{
String str;
	public Demo(String str)
	{
	this.str=str;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
	System.out.println(str+"\t"+i);
		try
		{
Thread.sleep(1000);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		}
	}
}
class TestThread4
{
public static void main(String args[]) throws Exception
	{
System.out.println("In Main");
Demo t1=new Demo("Java");	
Demo t2=new Demo("Oracle");	

t1.start();//runnable
t2.start();

	for(int i=1;i<=5;i++)
	{
System.out.println("IN MAIN "+i);
	try
	{
	t1.join();
	t2.join();
	//Thread.sleep(3000);
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
System.out.println("----THANK YOU--------");	
	}
}