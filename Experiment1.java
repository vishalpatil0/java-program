import java.util.Scanner;
class Phone{
  public void call(){
    System.out.println("Calling....");
  }
}
class smartPhone extends Phone{
  public void call()
  {
    System.out.println("smartphone calling....");
  }
  public void webAccess()
  {
    System.out.println("Accessing web...");
  }
}
public class Experiment1{
  public static void main(String[] args) {
    smartPhone smp=new Phone();
    smp.call();
  }
}