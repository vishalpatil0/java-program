import java.util.*;
import java.util.Scanner;

class D_constructor
{
	int x,y;
	D_constructor()
	{
		System.out.println("This is defalut constructor...");
	}
	D_constructor(int a)
	{
		x=a;
		System.out.println("The value of a: "+x);
	}
	
	void show()
	{
		System.out.println("value is :");

	}
	public static void main(String args[])
	{
		D_constructor a=new D_constructor(10);
		D_constructor a1=new D_constructor();
		a1.D_constructor(a);
		a1.show();
	}
}	