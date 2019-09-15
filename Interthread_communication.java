import java.io.*;
class Thread5
{
  int d;
  boolean flag=false;
  synchronized int getdata()
  {
	  if(flag==false)
	  {
		  try
		  {
			  wait();
		  }
		  catch(InterruptedException e)
		  {
			  System.out.println("Exception Caught");
		  }
	  }
	  System.out.println("Got data"+d);
	  flag=false;
	  notify();
	  return d;
  }
  synchronized void putdata(int d)
  {
	  if(flag==true)
	  {
		  try
		  {
			  wait();
		  }
		  catch(InterruptedException e)
		  {
			  System.out.println("Exception caught");
		  }
	  }
	  this.d=d;
	  System.out.println("Put data with value"+d);
	  flag=true;
	  notify();
  }
}
class producer implements Runnable
{
	Thread t;
	public producer(Thread5 t)
	{
		this.t=t;
		new Thread(this,"Producer").start();
		System.out.println("put called by producer");
	}
	public void run()
	{
      int data=0;
	  while(true)
	  {
		  data=data+1;
		  t.putdata(data);
	  }
	}
}
class consumer implements Runnable
{
		Thread t;
		public consumer(Thread5 t)
		{
			this.t=t;
			new Thread(this,"consumer").start();
			System.out.println("get called by consumer");
		}
		public void run()
		{
			while(true)
			{
				t.getdata();
			}
		}
	}
	public class Interthread_communication
	{
		public static void main(String args[])
		{
			Thread5 obj1=new Thread5();
			producer p=new producer(obj1);
			consumer c=new consumer(obj1);
			System.out.println("press ctrl + c to stop");
		}
}