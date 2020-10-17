import java.util.*;
class OneLine_ConditionalOperator
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the numbers for a and b");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int x=(a>b)?a:b;
  System.out.println(x+"is greater number");
 }
}
  