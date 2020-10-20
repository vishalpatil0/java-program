import java.util.*;
class ReverseDigitOfANumber
{
	public static void main(String args[])
	{
		 int num,rev=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("\nEnter the number");
		 num=sc.nextInt();
		 while(num>0)
		 {
			 rev=rev*10+num%10;
			 num=num/10;
		 }
		 System.out.println("\nreverse number is"+rev);
	}
}