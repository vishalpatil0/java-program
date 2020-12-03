class disco{
  void display(){
    System.out.println("ok ji");
  }
  protected int a=10;
}
public class Experiment1{
  public static void main(String[] args) {
    disco d=new disco();
    d.display();
    System.out.println(d.a);
  }
}