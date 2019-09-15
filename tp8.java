import java.util.*;
import static java.lang.System.out;
class tp7
{
  String s1;
  tp7()
  {
     out.println("Hello");
  }
  tp7(String s1)
  {
     this.s1=s1;
    
  }
  tp7(tp7 obj)
  {
     s1=obj.s1;
  }
  public  void display()
  {
     out.println(s1);
  }
}
class tp8
{
 public static void main(String args[])
 { 
     tp7 s=new tp7();
     tp7 s2=new tp7("Vishal");
     s2.display();
     tp7 s3=new tp7(s2);
     s3.display();
 }
}
	    