import java.util.*;
interface Area
{
	final static float pi=3.14f;
	float calc(float length,float width);
}
class rectangle implements Area
{

	public float calc(float length,float width)
	{
		return length*width;
	}
}
class circle implements Area
{
	public float calc(float radius,float y)
	{
		return pi*radius*radius;
	}
}
class interface_3
{
	public static void main(String args[])
	{
		rectangle rect=new rectangle();
		circle cir=new circle();
		Area area;
		area=rect;
		System.out.println("the area of rectangle is"+area.calc(10,20));
		area=cir;
		System.out.println("the area of circle is"+area.calc(10,20));
	}
}
	