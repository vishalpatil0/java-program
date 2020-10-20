import java.util.*;
class SwitchCaseProg
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter the number between 1 and 4");
		i=sc.nextInt();
		switch(i)
		{
			case 1: 
			           System.out.println("\nYour entered 1");
		                break;
            case 2:  System.out.println("\nYour entered 2");
		                break;						
		    case 3:  System.out.println("\nYour entered 3");
		                break;
			case 4:  System.out.println("\nYour entered 4");
		                break;
			default:
			           System.out.println("\nYour entered wrong choice");
		               break;
		}
		
	}
}

		