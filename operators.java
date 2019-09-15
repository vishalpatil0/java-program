import java.util.*;
import static java.lang.System.out;

class operators
{
    public static void main(String[] args) 
	{

    	int ch;
    	float a,b;
    	Scanner sc = new Scanner(System.in);
		out.println("1-Arithmetic Operator \n2-relational operator\n3-Logical operator\n4-Assignment Operator\n5-Increment operator\n6-conditional operator"); 
        out.println("Enter your choice");
		ch=sc.nextInt();
    	switch (ch) 
		{
         case 1:
		   out.println("enter two numbers");
		   a=sc.nextFloat();
		   b=sc.nextFloat();
           out.println(a+" +"+b+" =" +(a+b));
		   out.println(a+" -"+b+" =" +(a-b));
		   out.println(a+" *"+b+" =" +(a*b));
		   out.println(a+" /"+b+" =" +(a/b));
		   out.println(a+" %"+b+" =" +(a%b));
           break;

         case 2:
		        out.println("enter two numbers");
		        a=sc.nextFloat();
		        b=sc.nextFloat();
				if(a>b)
				{
                    out.println("a is greater");
                }
				else
				{
					out.println("b is greater");
				}
                break;

         case 3:
		        out.println("enter two numbers");
		        a=sc.nextFloat();
		        b=sc.nextFloat();
                if(a>b && a%b==0)
		        {
             			   out.println("a is greater");
		        }
                break;

         case 4:
		           out.println("enter two numbers");
		           a=sc.nextFloat();
		           b=sc.nextFloat();
                   b=a-1;
                    out.println("value of a is"+b);
					
		        break;

         case 5:
		          out.println("enter two numbers");
		          a=sc.nextFloat();
		          b=sc.nextFloat();
		          a++;
				  b--;
				  out.println("value of a is "+a+" and b is"+b);
		          break;
		  case 6: 
		          out.println("enter two numbers");
		          a=sc.nextFloat();
		          b=sc.nextFloat();
		          float value1 = (a>b) ? a : b;
                  out.println("greater number is "+value1);
				  break;
		  	  
		   default: 
                   out.println("Invalid choice!");
           break;
        }      
        
			
    }
}