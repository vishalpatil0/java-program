interface ok{
  void dis();
}
public class Experiment1 implements ok{
  public void dis(){
    System.out.println("hello there");
  }
  public static void main(String[] args) {
    Experiment1 ex=new Experiment1();
    ok o;
    o=ex;
    o.dis();
  }
}