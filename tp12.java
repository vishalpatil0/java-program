import java.util.*;
class Demo
{
    String s1;
    Demo()
	{
	  System.out.println("defalt constructor");
	}
	Demo(String s1)
    {
      this.s1=s1;
    }
    Demo (Demo obj)
    {
       obj.s1=s1;
    }
    public void display()
    {
        System.out.println(s1);	
	 }
 }
 class tp12
 {
 public static void main(String args[])
 {
   Demo d1=new Demo();
   Demo d2=new Demo("Vishal");
   d2.display();
   Demo d3=new Demo(d2);
    d3.display();
 }
} 
   