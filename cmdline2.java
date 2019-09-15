import java.util.*;
import static java.lang.System.out;
class cmdline2
{
 public static void main(String args[])
 {
   String s1=args[0];
   String s2=args[1];
   int n1=Integer.parseInt(s1);
   int n2=Integer.parseInt(s2);
   out.println((n1+n2));
  }
}