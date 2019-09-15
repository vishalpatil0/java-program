import java.util.*;
class data
{
 int length,width;
 data()
 {
  System.out.println("In default constructor");
 }
 data(int x,int y)
 {
   length=x;
   width=y;   
 }
 data(data obj)
 {
	 length=obj.length;
	 width=obj.width;
 }
 void calc()
 {
	 System.out.println("Area of rectangle is:"+(length*width));
 }
}
class constructors
{
	public static void main(String args[])
	{
		data d1=new data();
		data d2=new data(10,20);
		d2.calc();
		data d3=new data(d2);
		d3.calc();
	}
}