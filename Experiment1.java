import java.util.Scanner;

class Experiment1{
  static int fact(int num){
    if(num==1 || num==0)  return 1;
    return num*fact(num-1);
  }
  public static void main(String[] args) {
    int a=new Scanner(System.in).nextInt();
    System.out.printf("Factorial of %d is %d",a,fact(a));
  }
}