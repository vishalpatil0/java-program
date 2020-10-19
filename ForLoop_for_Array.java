import java.util.*;
class ForLoop_for_Array
{
public static void main(String args[])
{
  int a[],n,i;
  Scanner sc=new Scanner(System.in);
  System.out.println("\nEnter the limits of array");
    
  n=sc.nextInt();
  a=new int[n];

    
  for(i=0;i<a.length;i++)
  {
    System.out.format("\nEnter the %d element here = ",i+1);
    a[i]=sc.nextInt();
  }
  System.out.println("\nElements in array -------------");
     
  for(i=0;i<a.length;i++)
  {
    System.out.printf("Element at %d is %d\n",i+1,a[i]);
  }
  }
}
    
