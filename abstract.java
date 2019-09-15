import java.util.*;
import static java.lang.System.out;
abstract class shape
{
	float area;
	abstract void area();
	void display()
	{
		out.println("This is shape class");
	}
}
class circle extends shape
{
 int r;
 circle()
 {
    r=5;
 }
 void area()
 {
    area=3.14f*r*r;	 
 }
 void display()
 {
	 out.println("This is circle class \narea: "+area);
 }
}
class triangle extends shape
{
   int b,h;
   triangle(int m,int n)
   {
      b=m;
      h=n;
   }
   void area()
   {
      area=0.5f*b*h;
   }
void display()
{
   out.println("this is triangle class\narea:"+area);
}
}
class rect extends shape
{
   int l;
int b;
rect()
{
 l=7;
 b=8;
}
 void area()
 {
	 area=l*b;
 }
 void display()
{
   out.println("this is triangle class\narea:"+area);
}
}
class Abstract
{
	public static void main(String args[])
	{
		circle c=new circle();
		c.area();
		c.display();
		triangle t=new triangle(10,15);
		t.area();
		t.display();
		rect r=new rect();
		r.area();
		r.display();
	}
}
