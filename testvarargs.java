import java.util.*;
class vishal
{
 public void display(int ...n)
 {
   System.out.println("Hello"+n.length);
   for(int i:n)
   {
     System.out.println(i);
   }
  }
}
class testvarargs
{
 public static void main(String args[])
 {
   vishal v1=new vishal();
   v1.display();
   v1.display(10);
    v1.display(10,20);
	 v1.display(10,20,30);
  }
}