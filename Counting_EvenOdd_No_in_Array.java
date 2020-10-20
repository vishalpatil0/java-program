import java.util.*;
import static java.lang.System.out;
class Counting_EvenOdd_No_in_Array
{
 public static void main(String args[])
 {
   int arr[],i;
   Scanner sc=new Scanner(System.in);
   out.println("ENter limit of array");
   int n=sc.nextInt();
   arr=new int[n];
   out.println("ENter elements in array");
   for(i=0;i<n;i++)
   {
      arr[i]=sc.nextInt();
   }
   int cnt=0,counter=0;
   for(i=0;i<n;i++)
   {
      if(arr[i]/2==0)
	  {
	     cnt++;
	  }
	  else
	  {
	    counter++;
	  }
   }
   out.println("num of elements in array are even is:"+cnt+"and odd is:"+counter);
 }
}
      
   