class demo extends Thread
{
	String str;
	public demo(String str)
	{
		this.str=str;
	}
	public void run()
	{
		System.out.println("running");
	}
	//dead
}
class TestDemo
{
	public static void main(String args[])
	{
		Demo t1=new Demo("java");
		t1.start();//Runable
		System.out.println("ty");
	}
}
	