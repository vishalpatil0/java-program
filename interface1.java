	import java.io.*;
interface area
{
	 final static float pi=3.14f;
     float compute(float x, float y);
}
class rect implements area	 
{
   public float compute(float x,float y)
   {
	 return(x*y);
   }
}
class circle implements area	 
{
	public float compute(float x,float y)
	{
	 return(pi*x*x);
    }
}
class interface1
{
	public static void main(String args[])
	{
		rect r1=new rect();
		circle c1=new circle();
		area a1;
		a1=r1;
		System.out.println("Area of rectangle is"+a1.compute(10,20));
		a1=c1;
		System.out.println("Area of rectangle is"+a1.compute(10,0));
	}
}