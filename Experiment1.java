
import java.util.Scanner;

class Experiment1{
  public static void main(String[] args) {
    int a,b;
    System.out.print("Enter the value for a = ");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    System.out.print("Enter the value for b = ");
    b=sc.nextInt();
    System.out.println("Addition of "+a+"+"+b+" is "+(a+b));
  }
}