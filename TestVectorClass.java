import java.util.Vector;
public class TestVectorClass
{
 public static void main(String args[])
 {
 Vector v1=new Vector();
 /*
 Vector v2=new Vector(5);
 Vector v3=new Vector(5,2);*/
 System.out.println("Size of v1 is:"+v1.size());
 System.out.println("Capacity of v1 is:"+v1.capacity());
 v1.addElement(new Integer(10));
 v1.addElement(new Integer(20));
 v1.addElement(new Integer(10));
 v1.addElement(new Integer(5));
 /*for(int i:v1) 
 {
	 System.out.println(i);
 }*/
 System.out.println(v1);
 v1.remove(2);
 System.out.println(v1);
 System.out.println(v1.indexOf(20));
 System.out.println(v1.elementAt(2));
 System.out.println(v1.firstElement());
 System.out.println(v1.lastElement()); 
 v1.insertElementAt(100,2);
 System.out.println(v1);
 }
}
 
 
 
 
 