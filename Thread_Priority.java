class Demo extends Thread
{
String str;
public Demo(String str)
{
   this.str=str;
}
public void run()
{
 for(int i=1;i<5;i++)
 {
  System.out.println(str+"\t"+i);
 }
}
}
class Thread_Priority
{
 public static void main(String args[])
 {
	 Demo d1=new Demo("java");
	 Demo d2=new Demo("oracle");
	 System.out.println("In main");
	 d2.setPriority(Thread.MAX_PRIORITY);
	 d1.setPriority(Thread.MIN_PRIORITY+2);
	 d1.start();
	 d2.start();
	 for(int i=1;i<=5;i++)
	 {
		System.out.println("in main"+i);
     try
	 {
		 Thread.sleep(3000);
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 }
 }
}
		 
	 
