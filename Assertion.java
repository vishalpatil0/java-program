import java.util.Scanner;

/*
 * Assertion Syntax : assert(expression1):"expression2";
 */
public class Experiment1{
  public static void main(String[] args) {
    int[] toSum={2,3,4};
    System.out.println("Sum is "+sum(toSum));
  }
  public static int sum(int[] arr){
    assert (arr.length>0 && arr[0]>3) : "The first number is too small";
    int total=0;
    for (int i = 0; i < arr.length; i++) {
      total+=arr[i];
    }
    return total;
  }
}