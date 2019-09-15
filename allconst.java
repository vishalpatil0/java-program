import java.util.*;
class data
{
	int a,b;
	data()
	{
		System.out.println("\nHello world");
	}
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
    void show()
	{
		System.out.println("\na="+a+"\nb="+b);
	}
}
class allconst
{
	public static void main(String args[])
	{
		data d1=new data();
		data d2=new data(10,20);
		d2.show();
		data d3=new data(d2);
		d3.show();
	}
}	
		

		
		
	