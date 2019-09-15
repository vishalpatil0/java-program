import static java.lang.System.out;
import java.util.*;
class data
{
   public int n1,n2;
   data()
   {
     out.println("IN DEFAULT CONSTRUCTOR");
   }
   data(int x,int y)
   {
    n1=x;
    n2=y;
   }
   data(data obj)
   {
	   n1=obj.n1;
	   n2=obj.n2;
   }
   void show()
   {
	   out.println("n1="+n1);
	   out.println("n2="+n2);
   }
}
class allconst_1
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