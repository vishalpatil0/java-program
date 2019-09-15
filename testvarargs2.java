import java.util.*;
class vishal
{
 public void display(float f1,int ...n)
 {
   System.out.println("Hello"+n.length);
  }
  public void display2(float f1,float f2,int ...n)
 {
       
	      System.out.println("f1  "+f1);
		     System.out.println("f2  "+f2);
  
  }
 }
class testvarargs2
{
 public static void main(String args[])
 {
   vishal v1=new vishal();
   v1.display(10.10f);
    v1.display(10.10f,100);
	 
	 v1.display2(10.10f,20.20f,200);
	 System.exit(0);
  }
}