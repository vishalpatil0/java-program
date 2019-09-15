import java.util.*;
class forr
{
public static void main(String args[])
 {
    
    int a[],n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("\nenter the limits of array");
    
    n=sc.nextInt();
    a=new int[n];
    System.out.println("\nenter the elements");
    
    for(i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
       
     }
     System.out.println("\nelt are");
     
     for(i=0;i<a.length;i++)
     {
       System.out.println(" \n"+a[i]);
       
     }
  }
}
    
