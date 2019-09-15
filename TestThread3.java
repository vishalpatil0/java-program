class Demo implements Runnable
{	
String str;//java
	public Demo(String str)
	{
		System.out.println("In constructor..");
		this.str=str;
		/*Thread t=new Thread(this);
		t.start();*/
		new Thread(this).start();
	}
	public void run()//running...
	{
	System.out.println("In Run Method..");
	display();
	}
	public void display()
	{
	System.out.println("Hello...Display..."+str);
	}
}
class TestThread3
{
	public static void main(String args[])
	{
Demo t1=new Demo("Java");//Create Thread..
System.out.println("------THANK YOU---------");
	}
}
