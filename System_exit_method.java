import java.util.Scanner;
public class System_exit_method
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter zero to exit");
		int ch=sc.nextInt();
		if(ch==0)
		{
			System.exit(0); //exit()  method require int as parameter
		}
	}
}