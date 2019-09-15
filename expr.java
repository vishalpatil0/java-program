import static java.lang.System.out;
import java.util.*;
class expr
{
 public static void main(String args[])
 {
     int ch;
	 float a,b;
     Scanner sc=new Scanner(System.in);
     out.println("1=Addition\n2-Substraction\n3-Division\n4-Multiplication");
     out.println("\nEnter your choice");
     ch=sc.nextInt();
     switch(ch)
	 {
        case 1:
                out.println("Enter numbers");
                a=sc.nextFloat();
				b=sc.nextFloat();
				out.println(a+" +"+b+"="+(a+b));
				break;
		case 2:
                out.println("Enter numbers");
				a=sc.nextFloat();	
				b=sc.nextFloat();
				out.println(a+" -"+b+"="+(a-b));
				break;		        
	    case 3:
                out.println("Enter numbers");
				a=sc.nextFloat();
				b=sc.nextFloat();
				out.println(a+" /"+b+"="+(a/b));
				break;		        
	    case 4:
                out.println("Enter numbers");
				a=sc.nextFloat();
				b=sc.nextFloat();
				out.println(a+" *"+b+"="+(a*b));
				break;		        
		default:
		        out.println("\nyour entered wrong choice");
				break;
	 }
 }
}










	    
	    