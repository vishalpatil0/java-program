import java.io.*;
class testexception
{
 public static void main(String args[])
 {
   System.out.println("Hello");
   try
   {
     int n1=Integer.parseInt(args[0]);
	 int n2=Integer.parseInt(args[1]);
	 int ans=n1/n2;
	 System.out.println(ans);
   }
   catch(ArithmeticException e)
   {
      System.out.println("Exception is"+e);
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
      System.out.println("Exception is"+e);
   }
   catch(Exception e)
   {
      System.out.println("Any other Exception"+e);
   }
   finally
   {
     System.out.println("ty");
   }
   System.out.println("tysm.....");
  }
}