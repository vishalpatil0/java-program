import java.util.Scanner;
class Additionof2Numbers
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first element here");
  short x=sc.nextShort();
  System.out.println("Enter second element here");
  short y=sc.nextShort();
  System.out.format("Addition of %d and %d is %d\n",x,y,x+y);
}
}