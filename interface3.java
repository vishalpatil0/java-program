import java.io.*;
import java.util.*;
interface Area
{
   final static int n1=123;
   public int sd(int x);
}
class heroic implements Area
{
	int x;
	public int sd(int x)
	{
		this.x=x;
		System.out.println("Value of n is"+n1);
		return x;
	}
}
class interface3
{
  public static void main(String args[])
  {
      heroic h1=new heroic();
      Area area;
      area=h1;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter value for x");
	  int x=sc.nextInt();
      System.out.println("Value of x  is:"+area.sd(x));
  }
}  