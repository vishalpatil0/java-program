import java.util.*;
class data
{
 int a,b;
 data(int x,int y)
 {
	a=x;
	b=y;
 }
 data(data obj)
 {
	 a=obj.a;
	 b=obj.b;
 }
 
 void display()
 {
	 System.out.println("\na="+a+"\nb="+b);
 }
}
class copconst1
{
	public static void main(String args[])
	{
		data d1= new data(20,40);
		d1.display();
		data d2= new data(d1);
		d2.display();	
	}
}
		
		
 