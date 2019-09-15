import static java.lang.System.out;
import java.util.*;
class SoftwareTesting
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		out.println("1-For loop\n2-Do while\n3-If else");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: 
						int x;
						out.println("Enter the number foor table");
						x=sc.nextInt();
						for(int i=1;i<=10;i++)
						{
							out.println(i*x);
						}
		                break;
            case 2:  
						int g;
						out.println("Enter the value for g");
						g=sc.nextInt();	
						do
						{
							out.println("\n");
							out.println(g);
							g++;
						}while(g<11);
		                break;						
		    case 3: 
						int a;
						out.println("enter the number");
						a=sc.nextInt();
						if(a%2==0)
						{
							out.println("it is even");
						}
						else
						{
							out.println("it is odd");
						}
						break;
			default:
						out.println("\nYour entered wrong choice");
						break;
		}	
	}	
}		