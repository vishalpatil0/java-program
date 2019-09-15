import java.util.*;
class demo implements Runnable
{
	demo()
	{
		Thread t1=new Thread();
		t1.start();
		new Thread().start();
	}
	public void run()
	{
		System.out.println("Running");
	}
}
class thread_runnable
{
	public static void main(String args[])
	{	demo d1=new demo();
	}
}	