import java.util.*;
class whhile
{
public static void main(String args[])
 {
    
    int a[],n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("\nenter the limits of array");
    
    n=sc.nextInt();
    a=new int[n];
    System.out.println("\nenter the elements");
    i=0;
    while(i<a.length)
    {
      a[i]=sc.nextInt();
       i++;
     }
     System.out.println("\nelt are");
     i=0;
     while(i<a.length)
     {
       System.out.println(" \n"+a[i]);
       i++;
     }
  }
}
    
