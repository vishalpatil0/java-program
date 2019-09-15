import java.util.*;
import static java.lang.System.out;
class tp5
{
 public static void main(String args[])
 {
    int i,dsum;
	dsum=0;
	out.println("Enter your number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	do
	{
	  dsum=dsum+(n%10);
	  n=n/10;
	 }while(n>0);
	 out.println(dsum);
 }
}
	    