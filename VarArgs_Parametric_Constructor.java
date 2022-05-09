import java.util.Scanner;

class Demo{
  private int arr[];
  Demo(int ...arr)
  {
    this.arr=arr;
  }
  void prin()
  {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
  }
}
class Experiment1{
  public static void main(String[] args) {
    Demo d=new Demo(1,22,3,4,5,6,7);
    d.prin();
  }
}