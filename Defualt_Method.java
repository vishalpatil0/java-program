// default method are not compulsory to be overriden
// private and default method have body in interface.
// private method have scope only within its class or interface
// so we can use them in defualt method by calling them there as below
interface cellphone{
    void torch();
    private void battery(){
        System.out.println("battery is 98%");
    }
    default void call_receiving(){
        battery();
      System.out.println("receving call");
    }
  }
  class smartphone implements cellphone{
    public void torch(){
      System.out.println("Turning on torch....");
    }
    // public void call_receiving(){
    //   System.out.println("Receiving call in smartphone");
    // }
  }
  public class Defualt_Method{
    public static void main(String[] args) {
      smartphone s=new smartphone();
      s.torch();
      s.call_receiving();
    }
  }