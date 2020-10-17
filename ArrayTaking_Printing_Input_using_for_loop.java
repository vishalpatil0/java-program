import java.util.*;
import static java.lang.System.out;
class ArrayTaking_Printing_Input_using_for_loop
{
 public static void main(String args[])
 {
   int arr[];
   Scanner sc=new Scanner(System.in);
   arr=new int[5];
   out.println("Enter the elements");
   for(int i=0;i<arr.length;i++)
   {
     arr[i]=sc.nextInt();
   }
   for(int i=0;i<arr.length;i++)
   {
     out.println(arr[i]);
   }
 }
}