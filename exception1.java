import java.util.*;
import java.io.*;
class exception1
{
   public static void main(String args[])
   {
   System.out.println("Welcome");
   try
   {
     int n1=Integer.parseInt(args[0]);		
	 int n2=Integer.parseInt(args[1]);
	 System.out.println("Answer is:"+(n1/n2));
   }
   catch(Exception e)
   { 
     System.out.println("Exception is:"+e);
   }
   finally
   {
     System.out.println("FInally Statement");
   }
   System.out.println("ty");
  }
}
    
	 