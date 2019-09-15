import java.io.*;
class Demo implements Runnable
{
   public Demo()
   {
	   Thread t1=new Thread(this);
	   t1.start();
	   new Thread().start();
   }
   public void run()
   {
	   System.out.println("Running....");
   }
}
class Implement_Runnable
{
	public static void main(String args[])
	{
		Demo t1=new Demo();
		
	}
}