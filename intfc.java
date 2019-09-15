import java.util.*;
interface test
{
	final static float pi=3.14f;
	float compute(float x,float y);
}
class A implements test
{
	 public float compute(float x,float y)
	 {
		 return(x*y);
	 }
}
class B implements test
{
	 public float compute(float x,float y)
	 {
		 return(pi*x*x);
	 }
}
class intfc
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		test t1;
		t1=a;
		System.out.println("Area of rect is:"+t1.compute(7,8));
		t1=b;
		System.out.println("Area of circle is:"+t1.compute(7,0));
	}
}