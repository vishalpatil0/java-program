import java.util.*;
class parconst 
{
	int x;
	parconst(int a)
	{
		x=a;
	}
  public static void main(String[] args) 
  {
    parconst w = new parconst(2); // Creating an object
    w.display(); 
  }
  void display()
  {
	  System.out.println("\na="+x);
  }
}