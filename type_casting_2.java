import java.util.*;
class type_casting_2
{
 public static void main(String args[])
 {
  int n;
  System.out.println("Enter the value for n");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  double str=(double)n;
  System.out.println("After type casting");
  System.out.println(str);
 }
}