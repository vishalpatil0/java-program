import java.io.*;
import java.util.*;
class prac3_array
{
 public static void main(String args[])
 {
   int x[];
   x=new int[5];
   int y[]={9,2,3,4,5};
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter elements in array");
   for(int i=0;i<x.length;i++)
   {
     x[i]=sc.nextInt();
   }
	for(int i=0;i<x.length;i++)
   {
    System.out.println(x[i]);
   }
   for(int i=0;i<y.length;i++)
   {
    System.out.println(y[i]);
   }
  }
}  