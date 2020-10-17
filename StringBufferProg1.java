import java.util.*;
class StringBufferProg1
{
 public static void main(String args[])
 {
	 StringBuffer sb=new StringBuffer("Vishal");
	 System.out.println(sb);
	 sb.setLength(2); //set the length of string (whichi is actually array of character)
	 System.out.println(sb);
 }
}