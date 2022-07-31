/**
 *  A switch works with the byte, short, char, and int primitive data types.
 *  It also works with enumerated types (discussed in Enum Types), the String class, and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer (discussed in Numbers and Strings).
 */
import java.util.Scanner;
class SwitchCaseProg
{
	public static void main(String args[])
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter the number between 1 and 4");
		/**
		 * In java there is no method name nextChar() present in Scanner class so to take input for char we use next().charAt(0) approach.
		 */
		ch=sc.next().charAt(0);
		switch(ch)
		{
			case '1': 
			           System.out.println("\nYour entered 1");
		                break;
            case '2':  System.out.println("\nYour entered 2");
		                break;						
		    case '3':  System.out.println("\nYour entered 3");
		                break;
			case '4':  System.out.println("\nYour entered 4");
		                break;
			default:
			           System.out.println("\nYour entered wrong choice");
		               break;
		}
		
	}
}

		