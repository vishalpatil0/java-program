class Demo extends Thread
{
String str;
	public Demo(String str)
	{
	this.str=str;
	}
	public void run()//running...
	{
	display();
	}
	//dead
	public void display()
	{
	System.out.println("Display Method..");
	}
}
class TestThread11
{
	public static void main(String args[]) throws Exception
	{
	Demo t1=new Demo("Java");//create
	t1.start();//RUnnable...
	System.out.println("Thank you..");
	}

}