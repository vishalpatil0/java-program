interface cellphone{
  void torch();
  default void call_receiving(){
    System.out.println("receving call");
  }
}
class smartphone implements cellphone{
  public void torch(){
    System.out.println("Turning on torch....");
  }
  public void call_receiving(){
    System.out.println("Receiving call in smartphone");
  }
}
public class Experiment1{
  public static void main(String[] args) {
    smartphone s=new smartphone();
    s.torch();
    s.call_receiving();
  }
}