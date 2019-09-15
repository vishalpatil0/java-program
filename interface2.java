import java.io.*;
import java.util.*;
interface demo
{
  final static float a=12;
  public float copy(float x,float y);
}
class zxc implements demo{
public float copy(float x,float y)
{
	return(x*y);
}
}
class interface2
{
 public static void main(String args[])
 {
  zxc z=new zxc();
  demo d1;
  d1=z;
  System.out.println("area is :"+d1.copy(10,20));
 }
}