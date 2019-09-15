import java.util.*;
import static java.lang.System.out;
class for_2
{
 public static void main(String args[])
 {
  int i;
  loop1:for(i=1;i<=10;i++)
  {
   out.println(i*2);
  }
  out.println("1 ");
  Scanner sc=new Scanner(System.in);
  int y=sc.nextInt();
  if(y==1)
  {
	  loop1;
  }
 }
}