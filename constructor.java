import java.util.Scanner;
import java.util.*;
class Constructor
{
	int x,y;
	Constructor()
	{
		System.out.println("default constructor");
	}
		Constructor(int a,int b)
	{
		a=x;
		b=y;
		System.out.println("value of a & b is :"+x+" "+y);
	}
	void display()
	{
		 System.out.println("value of a & b is :"); 
	}
		
	public static void main(String args[])
	{

		Constructor a=new Constructor(10,20);
	    a.display();
	}
}