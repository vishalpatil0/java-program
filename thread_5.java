import java.util.*;
class demo extends Thread
{
	public void run()
	{
  for(int i=0;i<5;i++)
  {
	  System.out.println("a="+i);
  }
	}
}  
class demos extends Thread
{
	public void run()
	{
  for(int j=0;j<5;j++)
  {
	  System.out.println("b="+j);
      
  }
	}
}
class demoss extends Thread
{
	public void run()
	{
  for(int j=0;j<5;j++)
  {
	  System.out.println("c="+j);
  }
	}
}  
public class thread_5
{
	public static void main(String args[])
	{
		demo d1=new demo();
		d1.start();
		for(int i=0;i<5;i++) 
		{
			System.out.println("In main"+i);
		try
		{
		d1.sleep(4000);
		}
		catch(Exception e)
		{
		}
		
		}
		demos d2=new demos();
		d2.start();
		demoss d3=new demoss();
		d3.start();
		}
}