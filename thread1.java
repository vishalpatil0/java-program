import java.io.*;
class demo extends Thread
{
 String str;
 public demo(String str)
 {
   this.str=str;
 }
 public void run()
 {
  System.out.println("Running");
 }
 //Dead......
}
class thread1
{
 public static void main(String args[])
 {
  demo d1=new demo("java");
//  new demo().start();
//   System.out.println("ty.....");
 }
}